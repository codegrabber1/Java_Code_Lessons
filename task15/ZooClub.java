package task15;

import java.util.*;

public class ZooClub {

    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);

        String str;

        Map<Person, List<Animal>> map = new HashMap<>();

        Random r = new Random();
        boolean state = true;

        while(state) {
            addAction();
            System.out.println("Enter a number to deal with club");
            str = menu.next();

            switch(str) {

                case "1": {

                    Scanner num = new Scanner(System.in);

                    System.out.println("How many members to add in club?: ");

                    int s = num.nextInt();
                    for(int i = 0; i < s; i++) {

                        map.put(new Person("Petro"+r.nextInt(10), 23+r.nextInt(10)%9), new ArrayList<>());
                    }

                    System.out.println(map);
                    System.out.println("");
                    break;
                }
                case "2": {
                    Iterator<Map.Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();

                    if(map.isEmpty()){
                        System.out.println("The club is empty");
                    }else{
                        System.out.println("Choose the member of club to add an animal");
                        Scanner mNameMenu = new Scanner(System.in);

                        String nName = mNameMenu.next();

                        System.out.println("Enter the type and the name of pet using a space btn");

                        Scanner petMenu = new Scanner(System.in);

                        String s = petMenu.nextLine();
                        String[] pet = s.split(" ");

                        System.out.println();

                        Animal animal = new Animal(pet[0], pet[1]);

                        while(iterator.hasNext()) {
                            Map.Entry<Person, List<Animal>> next = iterator.next();

                            if(next.getKey().getPersonName().equals(nName) ) {
                                List<Animal> val = next.getValue();
                                val.add(animal);
                                next.setValue(val);
                            }
                        }

                        System.out.println(map);
                    }

                    System.out.println("");
                    break;
                }
                case "3": {
                    Iterator<Map.Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();

                    if(!map.isEmpty()) {



                        while(iterator.hasNext()) {
                            Map.Entry<Person, List<Animal>> next = iterator.next();

                            List<Animal> an = next.getValue();

                            System.out.println("Enter the animal's to delete");

                            Scanner petMenu = new Scanner(System.in);

                            String s = petMenu.nextLine();

                            Iterator<Animal> itr = an.iterator();

                            while(itr.hasNext()) {

                                Animal i = itr.next();
                                if(i.getAnimalName().equalsIgnoreCase(s)) {
                                    itr.remove();

                                } else {
                                    System.out.println("Not removed!");
                                }
                            }
                            System.out.println();

                            System.out.println("In the club live such pet(s): ");

                            Set<Map.Entry<Person, List<Animal>>> entrySet = map.entrySet();

                            for(Map.Entry<Person, List<Animal>> entr: entrySet)
                            {
                                System.out.println(entr.getValue());
                            }
                            System.out.println("");


                        }


                    } else {
                        System.out.println("The club is empty");
                    }


                    System.out.println("");
                    break;
                }
                case "4": {
                  Iterator<Map.Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();

                  if(map.isEmpty()){
                        System.out.println("The club is empty");
                    }else {
                        System.out.println("Enter the member's name to delete");

                        Scanner mName = new Scanner(System.in);

                        String s = mName.nextLine();

                        while(iterator.hasNext()){
                            Map.Entry<Person, List<Animal>> p = iterator.next();
                            if(p.getKey().getPersonName().equalsIgnoreCase(s)){
                                iterator.remove();
                            }
                        }
                        System.out.println("");
                        System.out.println(map);

                    }


                    System.out.println("");
                    break;
                }
                case "5": {

                    Iterator<Map.Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();

                    if(map.isEmpty()) {
                        System.out.println("There isn't any pet");

                    }else {
                        System.out.println("You're going to delete all pets. Are ypu sure? Type yes or no");
                        Scanner dMenu = new Scanner(System.in);

                        String dl = dMenu.next();

                        if(dl.equals("yes")) {
                            while(iterator.hasNext()) {
                                Map.Entry<Person, List<Animal>> next = iterator.next();

                                List<Animal> an = next.getValue();
                                an.clear();

                            }
                            System.out.println("You've deleted all animals from the club");
                        }
                    }


                    System.out.println(map);
                    System.out.println("");
                    break;
                }
                case "6": {

                    Set<Map.Entry<Person, List<Animal>>> entrySet = map.entrySet();

                    if(map.isEmpty()) {
                        System.out.println("The club is empty");

                    } else{
                        for(Map.Entry<Person, List<Animal>> entr: entrySet)
                        {
                            System.out.println(entr.getKey()+ "  " + entr.getValue());
                        }
                    }
                    System.out.println("");
                    break;
                }
                case "7": {
                    menu.close();
                    state = false;
                    System.out.println("Thank you");
                    System.exit(0);
                }
            }
        }

    }


    public static void addAction() {
        System.out.println("Enter: 1 to add a club member");
        System.out.println("Enter: 2 to add an animal for a club member");
        System.out.println("Enter: 3 to delete the animal");
        System.out.println("Enter: 4 to delete the member from the club");
        System.out.println("Enter: 5 to delete the animal from all members");
        System.out.println("Enter: 6 to show a zooclub");
        System.out.println("Enter: 7 to exit");
    }

}
