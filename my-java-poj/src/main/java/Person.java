public class Person {
    private String id;
    private String name;
    private String  friends;
    private String  url;


    public Person(String  newId, String  newName) {
        this.id = newId;
        this.name = newName;
    }
    public void setFriends(String friend){
        this.friends = friend;
    }

    public void setUrl(String urls){
        this.url = urls;
    }
    public void setId(String newId){
        this.id = newId;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public String toString() {
        if (friends == null) {
            return "Person. id: " + this.id + ", name: " + this.name + ", Not Friend";
        } else if (url == null) {
            return "Person. id: " + this.id + ", name: " + this.name + ", Friend: " + friends + ", Not Photo";
        } else {
            return "Person. id: " + this.id + ", name: " + this.name + ", Friend: " + friends + ", Photo Friend URL: " + url;

        }
    }
}

