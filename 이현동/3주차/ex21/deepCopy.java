package ex21;

import java.util.Objects;

class User implements Cloneable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
public class deepCopy {
    public static void main(String[] args) {
        try {
            User user = new User();
            user.setName("Edward");
            User copy = user;

            System.out.println(user.hashCode());
            System.out.println(copy.hashCode());
            System.out.println(user.equals(copy));

            User user2 = new User();
            user.setName("Edward");
            User copy2 = (User) user2.clone();

            System.out.println(user2.hashCode());
            System.out.println(copy2.hashCode());
            System.out.println(user2.equals(copy2));
        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
