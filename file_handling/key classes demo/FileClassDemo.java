
import java.io.File;
import java.io.IOException;

public class FileClassDemo {
  public static void main(String[] args) {
    try {
      // 1️⃣ Create a File object
      File file = new File("sample.txt");

      // 2️⃣ Create file if it doesn't exist
      if (file.createNewFile()) {
        System.out.println("✅ File created: " + file.getName());
      } else {
        System.out.println("⚠️ File already exists.");
      }

      // 3️⃣ Check if file exists
      if (file.exists()) {
        // 4️⃣ Display file info
        System.out.println("📄 File Name: " + file.getName());
        System.out.println("📍 Path: " + file.getAbsolutePath());
        System.out.println("✏️ Writable: " + file.canWrite());
        System.out.println("👁️ Readable: " + file.canRead());
        System.out.println("📏 File Size (bytes): " + file.length());
      }

      // 5️⃣ Delete file (optional)
      if (file.delete()) {
        System.out.println("🗑️ File deleted successfully.");
      } else {
        System.out.println("❌ Failed to delete the file.");
      }

      // 6️⃣ Create directory
      File folder = new File("MyFolder");
      if (folder.mkdir()) {
        System.out.println("📁 Directory created.");
      } else {
        System.out.println("⚠️ Directory already exists or failed.");
      }

      // 7️⃣ Create file inside folder
      File fileInFolder = new File("MyFolder/nested.txt");
      if (fileInFolder.createNewFile()) {
        System.out.println("✅ File created inside folder: " + fileInFolder.getName());
      }

    } catch (IOException e) {
      System.out.println("🚨 Error occurred.");
      e.printStackTrace();
    }
  }
}
