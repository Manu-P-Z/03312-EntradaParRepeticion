/* 
 * Copyright 2019 Manu Portolés Zagalá.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Manu Portolés Zagalá
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        int numPar = 0;
        boolean valCor;

        //   System.out.printf("%s", "Número par1 ...: ");
        do {
            try {
                System.out.printf("%s", "Número par ...: ");
                numPar = SCN.nextInt();
                valCor = true;

            } catch (Exception e) {
                //   System.out.printf("%s", "Número par ...: ");
                SCN.nextLine();
                valCor = false;
            }

        } while (numPar % 2 != 0 || valCor == false);

        System.out.printf("%s %d%n", "Número par ...:", numPar);

    }

}
