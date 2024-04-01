public class Mahasiswaku {
    public static void main(String[] args) {
        Mahasiswa<String, String, Integer> m = new Mahasiswa<>();
        m.setNim("1102020");
        m.setName("Ferdi");
        m.setClas(21);

        System.out.println("NIM Mahasiswa : " + m.getNim()); // 1102020
        System.out.println("Nama Mahasiswa : " + m.getName()); // Ferdi
        System.out.println("Kelas : " + m.getClas()); // 21
    }
}
