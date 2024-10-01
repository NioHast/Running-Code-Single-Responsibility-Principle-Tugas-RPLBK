// Main class
class SolusiPelanggaranSRP {
    public static void main(String[] args) {
        DatabaseManager databaseManager = new DatabaseManager();
        EmailService emailService = new EmailService();
        UserManager userManager = new UserManager(databaseManager);

        userManager.createUser("Contoh", "contoh@example.com", emailService);
    }
}

// Kelas yang bertanggung jawab untuk menyimpan ke database
class DatabaseManager {
    public void saveToDatabase(String username, String email) {
        // Logika menyimpan pengguna ke database
        System.out.println("User " + username + " disimpan ke database.");
    }
}

// Kelas yang bertanggung jawab untuk pengiriman email
class EmailService {
    public void sendWelcomeEmail(String email) {
        // Logika mengirim email notifikasi
        System.out.println("Email selamat datang dikirim ke " + email);
    }
}

// Kelas yang hanya bertanggung jawab untuk pengelolaan pengguna
class UserManager {
    private DatabaseManager databaseManager;

    public UserManager(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    public void createUser(String username, String email, EmailService emailService) {
        // Simpan pengguna ke database
        databaseManager.saveToDatabase(username, email);
        
        // Kirim email notifikasi
        emailService.sendWelcomeEmail(email);
    }
}