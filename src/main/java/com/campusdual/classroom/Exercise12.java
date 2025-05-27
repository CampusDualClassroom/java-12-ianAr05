package com.campusdual.classroom;

public class Exercise12 {
        public static void main(String[] args) {

                Car myCar = new Car("Toyota", "Yaris", "Gasolina");

                System.out.println("¿Tacómetro está a cero? " + myCar.isTachometerEqualToZero());

                System.out.println("Encendiendo el coche...");
                myCar.start();

                System.out.println("Intentando encender de nuevo...");
                myCar.start();

                System.out.println("Apagando el coche...");
                myCar.stop();

                System.out.println("Volvemos a encender para continuar...");
                myCar.start();

                System.out.println("Acelerando...");
                myCar.accelerate();
                System.out.println("Velocidad: " + myCar.speedometer);

                System.out.println("Intentando apagar el coche en movimiento...");
                myCar.stop();

                System.out.println("Acelerando al máximo...");
                for (int i = 0; i < 30; i++) {
                        myCar.accelerate();
                }
                System.out.println("Velocidad final: " + myCar.speedometer);

                System.out.println("Frenando una vez...");
                myCar.brake();
                System.out.println("Velocidad actual: " + myCar.speedometer);

                System.out.println("Frenando muchas veces...");
                for (int i = 0; i < 10; i++) {
                        myCar.brake();
                }
                System.out.println("Velocidad actual: " + myCar.speedometer);

                System.out.println("Girando 20 grados...");
                myCar.turnAngleOfWheels(20);
                System.out.println("Ángulo del volante: " + myCar.wheelsAngle);

                System.out.println("Girando 200 grados...");
                myCar.turnAngleOfWheels(200);
                System.out.println("Ángulo del volante: " + myCar.wheelsAngle);

                System.out.println("Girando -200 grados...");
                myCar.turnAngleOfWheels(-200);
                System.out.println("Ángulo del volante: " + myCar.wheelsAngle);

                System.out.println("Frenando por completo para activar marcha atrás...");
                for (int i = 0; i < 10; i++) {
                        myCar.brake();
                }
                myCar.setReverse(true);
                System.out.println("Marcha actual: " + myCar.gear);

                System.out.println("Quitando marcha atrás y acelerando hacia adelante...");
                myCar.setReverse(false);
                myCar.accelerate();
                myCar.accelerate();
                System.out.println("Velocidad: " + myCar.speedometer);

                System.out.println("Intentando poner marcha atrás en movimiento...");
                myCar.setReverse(true);
                System.out.println("Marcha actual: " + myCar.gear);

                System.out.println("Mostrando detalles del coche:");
                myCar.showDetails();
        }
}
