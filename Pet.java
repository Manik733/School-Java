public class Pet {
    private int type;
    private String name;

    Pet() {
        name = "noname";
        type = 0;
    }

    Pet(String petName, int petType) {
        name = petName;
        type = petType;
    }

    void setName(String petName) {
        name = petName;
    }

    void setType(int petType) {
        type = petType;
    }

    String getName() {
        return name;
    }

    int getType() {
        return type;
    }

    String getTypeStr() {
        String ret = " ";
        if (type == 0)
            ret = "unknown";
        else if (type == 1)
            ret = "dog";
        else if (type == 2)
            ret = "cat";
        else if (type == 3)
            ret = "bird";

        return ret;
    }

    public String toString() {
        return String.format("My name is %s. I am a %s.", name, getTypeStr());
    }

    boolean equals(Pet that) {
        int thatType = that.getType();
        if (type == thatType)
            return true;
        return false;
    }

}

/*
 * public class Pet {
 * private int type;
 * private String name;
 * 
 * Pet() {
 * name = "nonname";
 * type = 0;
 * }
 * 
 * Pet(String petName, int petType) {
 * name = petName;
 * type = petType;
 * }
 * 
 * void setName(String petName) {
 * name = petName;
 * }
 * 
 * void setType(int petType) {
 * type = petType;
 * }
 * 
 * String getName() {
 * return name;
 * }
 * 
 * int getType() {
 * return type;
 * }
 * 
 * String getTypeStr() {
 * String ret = " ";
 * if (type == 0)
 * ret = "unknown";
 * else if (type == 1)
 * ret = "dog";
 * else if (type == 2)
 * ret = "cat";
 * else if (type == 3)
 * ret = "bird";
 * 
 * return ret;
 * }
 * 
 * public String toString(){
 * return String.format("My name is %s. I am a %s.", name, getTypeStr());
 * }
 * 
 * boolean equals(Pet that){
 * int thatType = that.getType();
 * if(type == thatType)
 * return true;
 * return false;
 * }
 * 
 * }
 */
