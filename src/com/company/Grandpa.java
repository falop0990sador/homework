 package com.company;

    public class Grandpa {
        private String name;
        private int age;
        private Car car;
        private Ehight hight;

        public Grandpa(String name, int age, Car car, Ehight hight) {
            this.name = name;
            this.age = age;
            this.car = car;
            this.hight = hight;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public Car getCar() {
            return car;
        }

        public Ehight getHight() {
            return hight;
        }

        @Override
        public String toString() {
            return "Grandpa{" +
                    "name:'" + name + '\'' +
                    ", age:" + age +
                    ", car=" + car +
                    ", hight=" + hight +
                    '}';
        }
    }