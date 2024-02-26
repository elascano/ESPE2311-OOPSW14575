package ec.edu.espe.mazegen.model;

import java.util.ArrayList;

import ec.edu.espe.mazegen.utils.MatrixUtils;

public class Maze {
    private int width;
    private int height;
    private Room[][] rooms;

    public Maze(int width, int height) {
        this.width = width;
        this.height = height;
        this.rooms = new Room[width][height];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                rooms[i][j] = new Room(i, j);
            }
        }
    }

    private String generateAsciiRow(Room[] row, int elemPos) {
        String asciiRow = "";
        for (int i = 0; i < row.length; i++) {
            final Room room = row[i];
            final RoomElement roomElement = room.getRoomElement(elemPos);
            switch (elemPos) {
                case 0:
                case 2: {
                    if (roomElement instanceof Wall) {
                        // if (room.getPosX() == 0 || room.getPosX() == 1) {
                        //     asciiRow += "+";
                        // }
                        asciiRow += "+-";
                    } else if (roomElement instanceof Door) {
                        asciiRow += "+ ";
                    }
                    if (i == row.length - 1) {
                        asciiRow += "+";
                    }
                }; break;
                case 1: 
                case 3: {
                    if (roomElement instanceof Wall) {
                        asciiRow += "| ";
                    } else if (roomElement instanceof Door) {
                        if (room.isStartingRoom()) {
                            asciiRow += "  ";
                        } else if (room.isFinishRoom()) {
                            asciiRow += "S ";
                        } else {
                            asciiRow += "F ";
                        }
                    }
                    if (i == row.length - 1) {
                        asciiRow += "|";
                    }
                }; break;
                default:
                    break;
            }
        }
        return asciiRow;
    }

    public String generateAsciiMaze() {
        String result = "";

        int[] randomStartRoomPos = MatrixUtils.getRandomOuterElement(width, height);
        int[] randomFinishRoomPos = randomStartRoomPos;
        while (randomFinishRoomPos == randomStartRoomPos) {
            randomFinishRoomPos = MatrixUtils.getRandomOuterElement(width, height);
        }

        final Room startRoom = getRoom(randomStartRoomPos[0], randomStartRoomPos[1]);
        startRoom.setStartingRoom(true);
        // if (startRoom.getPosX() == 0) {
        //     if (startRoom.getPosY() == 0 || startRoom.g)
        // }

        final Room finishRoom = getRoom(randomFinishRoomPos[0], randomFinishRoomPos[1]);
        finishRoom.setFinishRoom(true);

        for (int i = 0; i < height; i++) {
            // result += "row: " + i + "/" + height;
            result += generateAsciiRow(rooms[i], 0);
            result += "\n";
            result += generateAsciiRow(rooms[i], 1);
            result += "\n";
            if (i == height - 1) {
                result += generateAsciiRow(rooms[i], 2);
            }
        }

        return result;
    }

    public Room getRoom(int row, int column) {
        return rooms[row - 1][column - 1];
    }
}
