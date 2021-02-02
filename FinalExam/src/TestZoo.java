class TestZoo {
    public static void main(String[] args) {
        Zoo sfZoo = new Zoo();
        
        sfZoo.addAnimal(new Bear());
        sfZoo.addAnimal(new Mouse());
        
        sfZoo.allTalking();
    }
}
