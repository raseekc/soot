/*-
 * #%L
 * Soot - a J*va Optimization Framework
 * %%
 * Copyright (C) 1997 - 2018 Raja Vallée-Rai and others
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 2.1 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-2.1.html>.
 * #L%
 */
public class Test91 {

    public static void main(String [] args){
        Test91 t91 = new Test91();
        t91.run();
    }

    public void run(){
        class MyClass {
            public MyClass(int x){
                System.out.println("x="+x);
            }
            public MyClass(int x, int y){
                System.out.println("x*y="+x*y);
            }
            public void run(){
                System.out.println("running");
            }
        }
        MyClass m1 = new MyClass(3);
        MyClass m2 = new MyClass(3, 4);
        m1.run();
        m2.run();
    }
}
