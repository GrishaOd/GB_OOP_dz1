public class Crisps extends Product{

        private String crispsTaste;

        public String getCrispsTaste() {
            return crispsTaste;
        }

        public void setVolume(String crispsTaste) {
            this.crispsTaste = crispsTaste;
        }

        public Crisps(String brand, String name, double price, String crispsTaste){
            super(brand, name, price);
            this.crispsTaste = crispsTaste;
        }

        @Override
        public String displayInfo() {
            return String.format("Чипсы\n\t[Производитель: %s\n\tНаименование: %s\n\tСтоимость: %.2f\n\tВкус: %s]",
                    brand, name, price, crispsTaste);
        }
}

