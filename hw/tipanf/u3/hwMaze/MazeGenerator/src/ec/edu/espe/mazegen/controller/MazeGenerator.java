package ec.edu.espe.mazegen.controller;

import ec.edu.espe.mazegen.model.Maze;
import ec.edu.espe.mazegen.model.Room;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Frederick
 */
public class MazeGenerator implements IMazeHandler {
    private Room[][] mazeMap;
    private Room startRoom;
    private Room endRoom;
    private ArrayList<Room> path = new ArrayList<>();
    
    public void generateMaze(Room[][] baseMaze){
        this.mazeMap = baseMaze;
        defineEntrances();
        definePath();        
    }
    
    private void defineEntrances(){
        int width = mazeMap.length;
        int height = mazeMap[0].length;
        Random random = new Random();
        int rng;
        
        rng = random.nextInt(0, height);
        
        startRoom = new Room(0,rng);
        startRoom.getWalls()[1].setState(false);
        startRoom.setType("start");
        startRoom.setPassed(true);
        path.add(startRoom);
        
        mazeMap[0][rng] = startRoom;
        
        rng = random.nextInt(0, height);
        
        endRoom = new Room(width-1,rng);
        endRoom.getWalls()[3].setState(false);
        endRoom.setType("end");
                
        mazeMap[width-1][rng] = endRoom;
    }
    
    private void definePath(){
        int direction;
        boolean hasPassed;
        int attempts=0;
        Random random = new Random();
        
        Room currentRoom;
        
        
        while(path.size()>0){
            currentRoom = path.get(path.size()-1);
            hasPassed=false;
            attempts=0;
            
            while (!hasPassed && attempts < 10) {
                attempts++;
                direction = random.nextInt(0, 4);
                hasPassed = validateDirection(direction, currentRoom);
            }

            if (!hasPassed) {
                path.remove(path.size()-1);
            }
        }
        
    }
    
    @Override
    public boolean validateDirection(int direction, Room currentRoom){
        boolean canContinue=false;
        
        switch(direction){
            case 0:
                canContinue=validateNorth(currentRoom);
                break;           
            case 1:
                canContinue=validateWest(currentRoom);
                break;    
            case 2:
                canContinue=validateSouth(currentRoom);
                break;   
            case 3:
                canContinue=validateEast(currentRoom);
                break;
        }
        
        return canContinue;
    }
    
    @Override
    public boolean validateNorth(Room currentRoom){
        boolean passed = false;
        
        if (currentRoom.getPosY() > 0) {
            Room nextRoom = mazeMap[currentRoom.getPosX()][(currentRoom.getPosY()-1)];
            if (!nextRoom.isPassed()) {
                currentRoom.getWalls()[0].setState(false);
                nextRoom.getWalls()[2].setState(false);

                nextRoom.setPassed(true);
                path.add(nextRoom);
                passed = true;
            }
        }
        return passed;
    }
    
    @Override
    public boolean validateWest(Room currentRoom){
        boolean passed = false;
        
        if (currentRoom.getPosX() > 0) {
            Room nextRoom = mazeMap[(currentRoom.getPosX()-1)][currentRoom.getPosY()];
            if (!nextRoom.isPassed()) {
                currentRoom.getWalls()[1].setState(false);
                nextRoom.getWalls()[3].setState(false);

                nextRoom.setPassed(true);
                path.add(nextRoom);
                passed = true;
            }
        }
        return passed;
    }
    
    @Override
    public boolean validateSouth(Room currentRoom){
        boolean passed = false;
        int height = mazeMap[0].length;
        
        if (currentRoom.getPosY() < (height - 1)) {
            Room nextRoom = mazeMap[currentRoom.getPosX()][(currentRoom.getPosY()+1)];
            if (!nextRoom.isPassed()) {
                currentRoom.getWalls()[2].setState(false);
                nextRoom.getWalls()[0].setState(false);

                nextRoom.setPassed(true);
                path.add(nextRoom);
                passed = true;
            }
        }
        return passed;
    }
    
    @Override
    public boolean validateEast(Room currentRoom){
        boolean passed = false;
        int width = mazeMap.length;
        
        if (currentRoom.getPosX() < (width - 1)) {
            Room nextRoom = mazeMap[(currentRoom.getPosX()+1)][currentRoom.getPosY()];
            if (!nextRoom.isPassed()) {
                currentRoom.getWalls()[3].setState(false);
                nextRoom.getWalls()[1].setState(false);

                nextRoom.setPassed(true);
                path.add(nextRoom);
                passed = true;
            }
        }
        return passed;
    }
    
}
