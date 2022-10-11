package Encapsulation;

public class E01 {
    public static void main(String[] args) {


        class Laptop{

            private String model;

            public String getModel() {
                return model;
            }

            public void setModel(String model) {
                this.model = model;
            }

            public String getYear() {
                return year;
            }

            public void setYear(String year) {
                this.year = year;
            }

            public String getMemory() {
                return memory;
            }

            public void setMemory(String memory) {
                this.memory = memory;
            }

            public String getProcessor() {
                return processor;
            }

            public void setProcessor(String processor) {
                this.processor = processor;
            }

            private String year;
            private String memory;
           private String processor;

        }
    }
}
