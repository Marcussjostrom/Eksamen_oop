

    interface Calc {
        double area();
        double volume();
    }
    public abstract class Shape3d implements Calc {
        abstract String properties();
        public String toString() {
            return this.getClass().getName() + ", " + properties() + ", Area: " + area() + ", Volume: " + volume();
        }
    }

    class Cube extends Shape3d implements Calc {
        double width;

        Cube(double width) {
            this.width = width;
        }

        @Override
        public double area() {
            return Math.pow(width, 2) * 6;
        }

        @Override
        public double volume() {
            return Math.pow(width, 3);
        }

        @Override
        String properties() {
            return "Width: " + width;
        }
    }

    class Pyramid extends Shape3d implements Calc {
        double width;
        double height;

        Pyramid(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public double area() {
            return width * width + width * Math.sqrt(Math.pow(width / 2, 2) + Math.pow(height, 2)) + width * Math.sqrt(Math.pow(width / 2, 2) + Math.pow(height, 2));
        }

        @Override
        public double volume() {
            return (width * width * height) / 3;
        }

        @Override
        String properties() {
            return "Width: " + width + ", Height: " + height;
        }
    }

    class Cylinder extends Shape3d implements Calc {
        double radius;
        double height;

        Cylinder(double radius, double height) {
            this.radius = radius;
            this.height = height;
        }

        @Override
        public double area() {
            return 2 * Math.PI * radius * height + 2 * Math.PI * Math.pow(radius, 2);
        }

        @Override
        public double volume() {
            return Math.PI * Math.pow(radius, 2) * height;
        }

        @Override
        String properties() {
            return "Radius: " + radius + ", Height: " + height;
        }
    }

    class Cone extends Shape3d implements Calc {
        double radius;
        double height;

        Cone(double radius, double height) {
            this.radius = radius;
            this.height = height;
        }

        @Override
        public double area() {
            return Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
        }

        @Override
        public double volume() {
            return Math.PI * Math.pow(radius, 2) * (height / 3);
        }

        @Override
        String properties() {
            return "Radius: " + radius + ", Height: " + height;
        }
    }

    class Sphere extends Shape3d implements Calc {
        double radius;

        Sphere(double radius) {
            this.radius = radius;
        }

        @Override
        public double area() {
            return 4 * Math.PI * Math.pow(radius, 2);
        }

        @Override
        public double volume() {
            return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        }

        @Override
        String properties() {
            return "Radius: " + radius;
        }
    }


