package ec.edu.espe.taxes.view;

import ec.edu.espe.taxes.utils.Taxes;

/**
 *
 * @author mate-
 */
public class Taxes_Calculator {
    public static void main(String[] args) {
        double salary = 4000;
    
    double gastoDeducible = (salary*0.1145)*12;
    
    double baseImponible = (salary*12) - gastoDeducible;
    
    double fraccionExponible = baseImponible - 33738;
    
    double impuestoAPagar = (fraccionExponible * 0.2) + 2571;
    
    Taxes taxes = new Taxes(salary, salary*12, gastoDeducible, baseImponible, impuestoAPagar, fraccionExponible);
    
        System.out.println(taxes);
    
    }
 
}

/*String countryName = UserInput.getString("Enter the name of the country: ");
        int ecuadorianPopulation = UserInput.getInt("Enter the Ecuadorian population of the country: ", 0);
        DPEXSystem.addCountry(new Country(countryName, ecuadorianPopulation));
        System.out.println("Country registered successfully!");*/
/* private static void registerElectoralPackage() {
        Country country = null;
        String jsonFilePath = "countries.json";
        Gson gson = new Gson();

        while (true) {
            final String countryName = UserInput.getString("Enter the country name: ");
            country = DPEXSystem.getCountry(countryName);

            if (country != null) { 
                PackageType packageType = null;
                boolean countryExists = false;

                try (Reader reader = new FileReader(jsonFilePath)) {
                    JsonArray jsonArray = gson.fromJson(reader, JsonArray.class);

                    for (JsonElement countryElement : jsonArray) {
                        JsonObject countryObject = countryElement.getAsJsonObject();
                        String name = countryObject.get("name").getAsString();

                        if (countryName.equalsIgnoreCase(name)) {
                            countryExists = true;
                            final int ecuadorianPopulation = country.getEcuadorianPopulation();

                            if (ecuadorianPopulation < 100) {
                                packageType = PackageType.CNE;
                            } else if (ecuadorianPopulation >= 100 && ecuadorianPopulation < 900) {
                                packageType = PackageType.MIXTO;
                            } else {
                                packageType = PackageType.GENERO;
                            }
                            break;
                        }
                    }

                    if (countryExists) {
                        System.out.println("Country ---> " + countryName + ": " + packageType);
                        // Aquí puedes realizar la lógica para registrar el paquete electoral
                        // DPEXSystem.registerPackage(new ElectoralPackage(country, packageType));
                        break;  
                    } else {
                        System.out.println("The country you entered doesn't exist");
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("The country you entered doesn't exist");
                break;  // Salir del bucle si no se encuentra el país
            }
        }
    }*/