public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;

    private final DigitalVideoDisc[] itemsOrdered =
            new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        addOne(disc);
    }

    /*
     * Varargs accepts individual DVDs and an existing DVD array.
     * Java cannot declare both DigitalVideoDisc[] and DigitalVideoDisc...
     * overloads because they have the same method signature.
     */
    public void addDigitalVideoDisc(DigitalVideoDisc... discs) {
        if (discs == null) return;
        for (DigitalVideoDisc disc : discs) addOne(disc);
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1,
                                    DigitalVideoDisc dvd2) {
        addOne(dvd1);
        addOne(dvd2);
    }

    private void addOne(DigitalVideoDisc disc) {
        if (disc == null) {
            System.out.println("Cannot add a null DVD.");
            return;
        }
        if (qtyOrdered >= MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is full.");
            return;
        }
        itemsOrdered[qtyOrdered++] = disc;
        System.out.println("The disc has been added.");
        if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is now full.");
        } else if (qtyOrdered == MAX_NUMBERS_ORDERED - 1) {
            System.out.println("The cart is almost full.");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        int index = -1;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("The disc was not found in the cart.");
            return;
        }
        for (int i = index; i < qtyOrdered - 1; i++) {
            itemsOrdered[i] = itemsOrdered[i + 1];
        }
        itemsOrdered[--qtyOrdered] = null;
        System.out.println("The disc has been removed.");
    }

    public double totalCost() {
        double total = 0.0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }

    public void printCart() {
        for (int i = 0; i < qtyOrdered; i++) {
            DigitalVideoDisc disc = itemsOrdered[i];
            System.out.printf("%d. %s - %.2f%n",
                    i + 1, disc.getTitle(), disc.getCost());
        }
    }

    public int getQtyOrdered() { return qtyOrdered; }
}
