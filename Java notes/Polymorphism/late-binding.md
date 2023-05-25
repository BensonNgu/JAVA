# Late Binding:
  - Refers to determining the specific method implementation at runtime instead of compile-time.
  - Resolution based on the actual object's type, not the declared type of the reference variable.
## Flexibility and Extensibility:
  - Allows for greater flexibility and extensibility in object-oriented programming.
  - Fundamental concept in polymorphism, with different classes having different method implementations with the same name.
  - Method implementation dynamically determined based on the object's actual type when called.
## Example in Java:
  - Illustration of late binding in Java:
    ```java
    class Shape {
        public void draw() {
            System.out.println("Drawing a shape");
        }
    }

    class Circle extends Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a circle");
        }
    }

    class Square extends Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a square");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Shape shape1 = new Circle();
            Shape shape2 = new Square();

            shape1.draw();  // Late binding: calls draw() method of Circle class
            shape2.draw();  // Late binding: calls draw() method of Square class
        }
    }
    ```
