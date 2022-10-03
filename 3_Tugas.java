    public static void main(String[] args) {
        String ent=" ";
        Scanner input=new Scanner(System.in);
        String[] Menu = {"Pertambahan", "Perkalian", "Pengurangan", "Pembagian"};
        String[] Simbol={"+","x","-",":","="};
        Boolean Repeat = true;
        while(Repeat==true){
            int hasil=0,
                bilangan1=0,
                bilangan2=0,
                menus=1;
            for(int list=0;list<Menu.length;list++){
                System.out.println(menus+". "+Menu[list]);
                menus++;
            }
            System.out.print("Pilih salah satu: ");
            int menupilihan=input.nextInt()-1;
            System.out.print("Masukkan Bilangan 1: ");
            bilangan1=input.nextInt();
            System.out.print("Masukkan Bilangan 2: ");
            bilangan2=input.nextInt();
            if(menupilihan==0){
                hasil=bilangan1+bilangan2;
                System.out.print(bilangan1+ent+Simbol[menupilihan]+ent+bilangan2+ent+Simbol[4]+ent+hasil);
            } else if (menupilihan==1){
                hasil=bilangan1-bilangan2;
                System.out.print(bilangan1+ent+Simbol[menupilihan]+ent+bilangan2+ent+Simbol[4]+ent+hasil);
            } else if (menupilihan==2){
                hasil=bilangan1*bilangan2;
                System.out.print(bilangan1+ent+Simbol[menupilihan]+ent+bilangan2+ent+Simbol[4]+ent+hasil);
            } else if (menupilihan==3){
                hasil=bilangan1/bilangan2;
                System.out.print(bilangan1+ent+Simbol[menupilihan]+ent+bilangan2+ent+Simbol[4]+ent+hasil);
            } else {
                System.out.println("Menu tidak ditemukan.");
            }
            System.out.println("\nKembali lagi? (y/n)");
            String ripit=input.next();
            if(ripit.equalsIgnoreCase("n")){
                Repeat=false;
            }
            
        }
        
    }
