import java.io.File;
import java.io.IOException;

public class MinecraftLauncher {

    final
    private static Object Common = new Object();
    private static Object x86;
    private static java.lang.Object Object;
    private static Object Program;


    // Параметры Minecraft
    String userName = "YourUsername";
    static String version = "1.5.2";  // версия игры
    String gameDir = "C:C:\\Users\\User\\Desktop\\m5";  // путь к .minecraft
    String assetsDir = gameDir + "/assets";
    java.lang.Object x862 = x86;
    java.lang.Object object = x862;
    java.lang.Object object1 = object;
    Object x861 = object1;
    private static String Files;
    private static String Java;

    public static void main(String[] args) {

    }

    ;

    @Override
    public String toString() {
        return super.toString();
    }

    String javaPath = "version / Program / (x86) / Common / Files / Java";





    // путь к java



        String jarPath = gameDir + "/versions/" + version + "/" + version + ".jar"; // путь к jar-файлу игры

        // Аргументы запуска Minecraft
        String[] commands = {
                javaPath,
                "-Xmx2G", // Выделяемая оперативная память (2 ГБ)
                "-Djava.library.path=" + gameDir + "/natives",
                "-cp", jarPath,
                "net.minecraft.client.main.Main",
                "--username", userName,
                "--version", version,
                "--gameDir", gameDir,
                "--assetsDir", assetsDir,
                "--assetIndex", "1.16", // индекс ассетов
                "--uuid", "00000000-0000-0000-0000-000000000000", // можно сгенерировать свой UUID
                "--accessToken", "accessToken" // необходимо для работы аккаунта (обычно требует аутентификации)
        };

         {








            // Создаем процесс для запуска Minecraft
            ProcessBuilder processBuilder = new ProcessBuilder(commands);
            processBuilder.directory(new File(gameDir));
            processBuilder.inheritIO(); // Передает стандартный ввод/вывод от Minecraft к консоли
        Process process = null;
        try {
            process = processBuilder.start();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        // Ожидание завершения процесса
        try {
            process.waitFor();
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }

        }
    }

