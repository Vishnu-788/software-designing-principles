package patterns;

class BlogPost {
    public BlogPost(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }

    // Instance Variables.
    private final int id;
    private final String name;

    // Methods - Getters and setters
    public int getId() { return id; }
    public String getName() { return name; }

    public static class Builder {
        // Same instance variables
        private int id;
        private String name;

        // Same methods - Getters and setters
        public int getId() { return id; }
        public String getName() { return name; }
        public Builder setId(int id) {
            this.id = id;
            return this;
        }
        public Builder setName(String name) {
            this.name = name;
            return this;
        }


        public BlogPost build() {
            return new BlogPost(this);
        }
    }
}

public class BuilderPattern {
    public static void main(String[] args) {
        BlogPost blog = new BlogPost.Builder()
                .setId(101)
                .setName("Vishnu")
                .build();

        System.out.println(blog.getId());
        System.out.println(blog.getName());
    }
}
