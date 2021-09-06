public class demoInnerClass {
    public void demo(){
        class demoFunctionInnerClass{
            public String getDemoName() {
                return demoName;
            }

            public void setDemoName(String demoName) {
                this.demoName = demoName;
            }

            private String demoName;
        }
    }
    public static class InnerClass{
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
