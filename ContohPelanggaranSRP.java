// Contoh kode yang melanggar Single Responsibility Principle
class ContohPelanggaranSRP {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        userManager.createUser("contoh", "contoh@example.com");
    }
}

class UserManager {
    public void createUser(String username, String email) {
        // Simpan pengguna ke database
        saveToDatabase(username, email);

        // Kirim email notifikasi
        sendWelcomeEmail(email);
    }

    private void saveToDatabase(String username, String email) {
        // Logika menyimpan pengguna ke database
        System.out.println("User " + username + " disimpan ke database.");
    }

    private void sendWelcomeEmail(String email) {
        // Logika mengirim email notifikasi
        System.out.println("Email selamat datang dikirim ke " + email);
    }
}