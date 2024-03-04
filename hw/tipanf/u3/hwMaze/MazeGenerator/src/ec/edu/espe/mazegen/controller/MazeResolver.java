package ec.edu.espe.mazegen.controller;

import ec.edu.espe.mazegen.model.Room;
import java.util.ArrayList;

/**
 *
 * @author Frederick
 */
public class MazeResolver implements IMazeHandler{
    private Room[][] mazeMap;
    private int height;
    private int width;
    private ArrayList<Room> path = new ArrayList<>();
    
    public void resolveMaze(Room[][] baseMaze){
        this.mazeMap = baseMaze;
        this.width = mazeMap.length;
        this.height = mazeMap[0].length;
        clearVisitedRoom();
        locateStart();
        generatePath();        
    }
    
    private void clearVisitedRoom(){
        for(int j=0;j<height;j++){
            for(int i=0;i<width;i++){
                mazeMap[i][j].setPassed(false);
           }
        }
    }
    
    private void locateStart(){
        
        for(int j=0;j<height;j++){
            if ("start".equals(mazeMap[0][j].getType())) {
                mazeMap[0][j].setPassed(true);
                path.add(mazeMap[0][j]);
            }
        }
    }
    
    
    private void generatePath(){
        boolean hasPassed;
        int attempts;
        int direction;
        
        Room currentRoom;
        
        
        while(path.size()>0){
            currentRoom = path.get(path.size()-1);
            hasPassed=false;
            attempts=0;
            direction=0;
            
            while (!hasPassed && direction<4 && attempts<10) {
                attempts++;
                hasPassed = validateDirection(direction, currentRoom);
                direction++;
            }

            if (!hasPassed) {
                path.get(path.size()-1).setType("default");
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
        boolean isClosed = currentRoom.getWalls()[0].getState();
        
        
        if (!isClosed) { 
            Room nextRoom = mazeMap[currentRoom.getPosX()][(currentRoom.getPosY()-1)];
            if (!nextRoom.isPassed()) {
                
                if(!"end".equals(nextRoom.getType())){
                    nextRoom.setType("path");
                }
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
        boolean isClosed = currentRoom.getWalls()[1].getState();
        
        
        if("start".equals(currentRoom.getType())){
            isClosed = true;
        }
        
        if (!isClosed) {
            Room nextRoom = mazeMap[(currentRoom.getPosX()-1)][currentRoom.getPosY()];
            if (!nextRoom.isPassed()) {

                if(!"end".equals(nextRoom.getType())){
                    nextRoom.setType("path");
                }
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
        boolean isClosed = currentRoom.getWalls()[2].getState();
        
        if (!isClosed) {
            Room nextRoom = mazeMap[currentRoom.getPosX()][(currentRoom.getPosY()+1)];
            if (!nextRoom.isPassed()) {

                if(!"end".equals(nextRoom.getType())){
                    nextRoom.setType("path");
                }
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
        boolean isClosed = currentRoom.getWalls()[3].getState();
        
        
        
        if("end".equals(currentRoom.getType())){
            isClosed = true;
            path.clear();
            path.add(new Room(-1,-1));
        }
        
        
        if (!isClosed) {
            Room nextRoom = mazeMap[(currentRoom.getPosX()+1)][currentRoom.getPosY()];
            if (!nextRoom.isPassed()) {
                
                if(!"end".equals(nextRoom.getType())){
                    nextRoom.setType("path");
                }
                nextRoom.setPassed(true);
                path.add(nextRoom);
                passed = true;
            }
        }
        return passed;
    }
}
