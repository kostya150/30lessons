package lesson11.HW;

public class GoogleAPI implements API {
    Room[] rooms;

    public GoogleAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int index = 0;
        for(Room rooms : rooms){
            if(rooms != null && (rooms.getPrice() == price) || (rooms.getPrice() == price) && persons == rooms.getPersons() && city == rooms.getCityName() && hotel == rooms.getHotelName()){
                index++;
            }
        }

        Room[]results = new Room[index];
        int i = 0;
        for (Room room : rooms){
            if (room != null && (room.getPersons() == (persons)  || room.getPersons() >= (persons)) && price == room.getPrice() && city == room.getCityName() && hotel == room.getHotelName()){
                results[i] = room;
                i++;
            }

        }

        return results;
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }
}
