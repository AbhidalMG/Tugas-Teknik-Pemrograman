package PRAKTIK2;

abstract class Shape {
        public String name; //name of the shape
        public Shape(String string) {
                name = string;
        }

        abstract double area();
        
        public String toString() {
                return name;
        }   
}
