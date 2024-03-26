package org.example.pattern.builder;

public class User {
    private final String name;
    private final String email;
    private final int id;

    public User(UserBuilder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.id = builder.id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return this.email+":"+this.name+":"+this.id;
    }
    public static class UserBuilder{
        private  String name;
        private  String email;
        private  int id;

        public UserBuilder() {
        }

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder setId(int id) {
            this.id = id;
            return this;
        }
        public User builder(){
            return new User(this);
        }

    }
}
