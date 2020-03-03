package Todo2020;

/*Jos� Toledo
 Este es solo un ejemplo muy basico de como realizar una prueba de automatizaci�n en selenium generando un documento excel.
 -*Informaci�n a considerar
 -como prueba basica no se le puso validacion
 -La informacion que arroja la prueba se guardan en el escritorio para que sea mas facil revisar la informacion 
 * */
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Vendimia_CP {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {

		String unidad = "C://Users//";
		String chromedriver = "//Desktop//CPVendimia//chromedriver.exe";
		String Ruta = "//Desktop//CPVendimia//CP//";

		final String user = System.getProperty("user.name");
	
		// se forma la ruta completa
		System.setProperty("webdriver.chrome.driver", unidad + user + chromedriver);
		String driverPath = "//Desktop//CPVendimia//chromedriver.exe";
		WebDriver driver = new ChromeDriver();
		String hoja = "Caso de Prueba";

		XSSFWorkbook libro = new XSSFWorkbook();
		XSSFSheet hoja1 = libro.createSheet(hoja);

		// cabecera de la hoja de excel
		String[] header = new String[] { "Paso", "Descripci�n del Paso", "Resultado del Sistema" };

		/// ***
		// variable para cada campo
		String billing_first_name = "TestNombre";
		String billing_street = "TestDirecci�n";
		String billing_city = "TestCiudad";
		String billing_zip = "80256";
		String email = "TestWeb@HTester.com";
		String phone = "+52698632644";
		String billing_country = "MX";

		// Definimos dos variables para almacenar el momento en que comienza y finaliza
		// la prueba
		long time_start, time_end;
		// la ruta de la pagina que se quiere entrar
		String web = "https://test3118.webnode.mx/";
		
		String PaginaInicio = web;
		time_start = System.currentTimeMillis();
		driver.get(web);

		// Maximizamos la ventana
		driver.manage().window().maximize();
		/***********************************************************************************************/
		esperarSegundos(driver, 3);
		driver.findElement(By.xpath(
				"//img[contains(@src,'https://d1di2lzuh97fh2.cloudfront.net/files/1i/1i2/450/1i242a.png?ph=13750aae77')]"))
				.click();
		esperarSegundos(driver, 1);
		driver.findElement(
				By.xpath("//main[@id='main']/div/div/section/div[2]/div/form/div[3]/div[3]/div/button/span[2]"))
				.click();
		esperarSegundos(driver, 1);
		driver.findElement(By.xpath("//nav[@id='menu']/div/ul/li/a/span")).click();
		esperarSegundos(driver, 1);
		driver.findElement(By.xpath(
				"//img[contains(@src,'https://d1di2lzuh97fh2.cloudfront.net/files/17/17v/450/17v227.png?ph=13750aae77')]"))
				.click();
		esperarSegundos(driver, 1);
		driver.findElement(
				By.xpath("//main[@id='main']/div/div/section/div[2]/div/form/div[3]/div[3]/div/button/span[2]/span"))
				.click();
		esperarSegundos(driver, 1);
		driver.findElement(By.xpath("//nav[@id='menu']/div/ul/li/a/span")).click();
		esperarSegundos(driver, 1);
		driver.findElement(By
				.xpath("//div[@id='wnd_ProductsZone_215502']/div/div[2]/div/div/article[9]/div/a/div[2]/h2/span/span"))
				.click();
		esperarSegundos(driver, 1);
		driver.findElement(
				By.xpath("//main[@id='main']/div/div/section/div[2]/div/form/div[3]/div[3]/div/button/span[2]"))
				.click();
		esperarSegundos(driver, 1);
		driver.findElement(By.xpath("//header[@id='header']/div/div/div/div/div[2]/div/div[2]/div/a/div")).click();
		esperarSegundos(driver, 1);
		driver.findElement(By.linkText("Pagar")).click();
		esperarSegundos(driver, 1);
		driver.findElement(By.name("billing_first_name")).sendKeys(billing_first_name);
		esperarSegundos(driver, 1);
		driver.findElement(By.name("billing_street")).sendKeys(billing_street);
		esperarSegundos(driver, 1);
		driver.findElement(By.name("billing_city")).sendKeys(billing_city);
		esperarSegundos(driver, 2);
		esperarSegundos(driver, 1);
		driver.findElement(By.name("billing_zip")).sendKeys(billing_zip);
		driver.findElement(By.name("billing_country")).click();
		driver.findElement(By.name("billing_country")).click();
		new Select(driver.findElement(By.name("billing_country"))).selectByValue(billing_country);
		esperarSegundos(driver, 1);
		driver.findElement(By.name("email")).click();
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys(email);
		esperarSegundos(driver, 1);
		driver.findElement(By.name("phone")).clear();
		driver.findElement(By.name("phone")).sendKeys(phone);
		driver.findElement(By.name("send")).click();
		esperarSegundos(driver, 1);
		driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='N�mero de tel�fono'])[3]/following::span[1]"))
				.click();
		driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Direcci�n de la tienda'])[1]/following::button[1]"))
				.click();
		driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Pago contra reembolso'])[1]/following::button[1]"))
				.click();
		esperarSegundos(driver, 1);
		driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Quiero recibir emails con noticias y ofertas especiales'])[1]/following::button[1]"))
				.click();
		esperarSegundos(driver, 1);
		driver.findElement(By.id("ch-agree")).click();
		esperarSegundos(driver, 1);
		takeScreenShotTest(driver, "Fin de la prueba");
		driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Quiero recibir emails con noticias y ofertas especiales'])[1]/following::button[1]"))
				.click();
		esperarSegundos(driver, 1);

		esperarSegundos(driver, 3);
		driver.quit();

		/***********************************************************************************************/
		System.out
				.println("Fin de la prueba ------------------------------------------------------------------------ ");
		esperarSegundos(driver, 2);

		String nombreArchivo = "-VENTA.xlsx";
		String todo = "CP001" + nombreArchivo;

		String rutaArchivo = unidad + user + Ruta + todo;
		
		// contenido de la hoja de excel
		String[][] document = new String[][] { { "o", "o", "o" }, { "x", "x", "x" },
				{ "1", "Se ingresa a la pagina:", PaginaInicio },
				{ "2", "El sistema muestra la pantalla de inicio con los art�culo que tiene en venta: ",
						"El sistema muestra una lista de art�culo que est�n en venta" },
				{ "3", "Click a un  art�culo que se muestra en la lista: ", "Se muestra  la informaci�n del producto" },
				{ "4", "El sistema muestra la informaci�n del art�culo y un bot�n para agregar a la cesta:",
						"Aprobado" },
				{ "5", "Click al bot�n de a�adir a la cesta para su compra",
						"El art�culo se agrega en la cesta donde aparece la cantidad de art�culos agregados" },
				{ "6", "Se regresa a la pantalla de inicio:", "Aprobado" },
				{ "7", "Click a un a  articulo en la pantalla: ", "Se muestra  la informaci�n del producto" },
				{ "8", "El sistema muestra la informaci�n del art�culo y un bot�n para agregar a la cesta:",
						"Aprobado" },
				{ "10", "Click al bot�n de a�adir a la cesta para su compra",
						"El art�culo se agrega en la cesta donde aparece la cantidad de art�culos agregados" },
				{ "11", "Se regresa a la pantalla de inicio:", "Aprobado" },
				{ "12", "Click a un  art�culo que se muestra en la lista: ",
						"Se muestra  la informaci�n del producto" },
				{ "13", "El sistema muestra la informaci�n del art�culo y un bot�n para agregar a la cesta:",
						"Aprobado" },
				{ "14", "Click al bot�n de a�adir a la cesta para su compra",
						"El art�culo se agrega en la cesta donde aparece la cantidad de art�culos agregados" },
				{ "15", "Se regresa a la pantalla de inicio", "Aprobado" },
				{ "16", "Click al bot�n de pagar",
						"El sistema muestra una lista con los producto que se han seleccionado para la compra" },
				{ "17", "Click al bot�n de pagar",
						"El sistema muestra una nueva pantalla donde  se pide capturar la informaci�n del cliente \r\n"
								+ "para la factura y muestra el total a pagar por los art�culos seleccionados" },
				{ "18", "Se captura la informaci�n necesaria para la facturaci�n ",
						"El sistema muestra los campos con la informaci�n" },
				{ "19", "Click en el bot�n continuar", "El sistema muestra la pantalla de envi�" },
				{ "20", "Se selecciona una opci�n de envi�  y  click al bot�n continuar ",
						"El sistema muestra una pantalla  donde se puede seleccionar   un m�todo de pago " },
				{ "21", "Click al bot�n continuar", "El sistema muestra los datos de facturaci�n y de envi�" },
				{ "22", "Se aceptan los  T�rminos y Condiciones",
						"Se muestra la opci�n de -Estoy de acuerdo con los T�rminos y Condiciones test3118.webnode.mx- seleccionada" },
				{ "23", "Click en finalizar la venta",
						"El sistema procesa la venta y muestra una nueva pantalla con el mensaje de Su pedido ha sido realizado. Recibir�s un correo electr�nico con los detalles del pedido." },
				{ "24", "CU", "Fin " }

		};

		// poner negrita a la cabecera
		// Creamos el estilo paga las celdas del encabezado
		CellStyle style = libro.createCellStyle();
		Font font = libro.createFont();
		font.setBold(true);
		style.setFont(font);
		// Indicamos que tendra un fondo azul aqua
		// con patron solido del color indicado
		style.setFillForegroundColor(IndexedColors.AQUA.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

		// titulos 2
		String[] titulos2 = { "Nombre del CP:", "CP001VENTA", "" };

		// Creamos una fila en la hoja en la posicion 0
		Row fila = hoja1.createRow(0);

		// Creamos el encabezado
		for (int i = 0; i < titulos2.length; i++) {
			// Creamos una celda en esa fila, en la posicion
			// indicada por el contador del ciclo
			Cell celda = fila.createCell(i);

			// Indicamos el estilo que deseamos
			celda.setCellStyle(style);
			celda.setCellValue(titulos2[i]);
		}

		// generar los datos para el documento
		for (int i = 2; i <= document.length; i++) {
			XSSFRow row = hoja1.createRow(i);// se crea las filas
			for (int j = 0; j < header.length; j++) {
				if (i == 2) {// para la cabecera
					XSSFCell cell = row.createCell(j);// se crea las celdas para la cabecera, junto con la posici�n
					cell.setCellStyle(style); // se a�ade el style crea anteriormente
					cell.setCellValue(header[j]);// se a�ade el contenido
				} else {// para el contenido
					XSSFCell cell = row.createCell(j);// se crea las celdas para la contenido, junto con la posici�n
					cell.setCellValue(document[i - 1][j]); // se a�ade el contenido
				}
			}
		}

		File file;
		file = new File(rutaArchivo);
		try (FileOutputStream fileOuS = new FileOutputStream(file)) {
			if (file.exists()) {// si el archivo existe se elimina
				file.delete();
			
			}
			libro.write(fileOuS);
			fileOuS.flush();
			fileOuS.close();
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void takeScreenShotTest(WebDriver driver, String imageName) {
		// capturar imagenes -takeScreenShotTest(driver, "Nombre de la imagen");

		// Directorio donde quedaran las imagenes guardadas
		String ImG1 = "C:\\Users\\";
		String ImG2 = "\\Desktop\\CPVendimia\\imagenes";
		final String user = System.getProperty("user.name");
	

		File directory = new File(ImG1 + user + ImG2);

		try {
			if (directory.isDirectory()) {
				// Toma la captura de imagen
				File imagen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// Mueve el archivo a la carga especificada con el respectivo
				// nombre
				FileUtils.copyFile(imagen, new File(directory.getAbsolutePath() + "\\" + imageName + ".png"));
			} else {
				// Se lanza la excepcion cuando no encuentre el directorio
				throw new IOException("ERROR : La ruta especificada no es un directorio!");
			}
		} catch (IOException e) {
			// Impresion de Excepciones
			e.printStackTrace();
		}
	}

	public static void esperarSegundos(WebDriver driver, int segundos) {

		synchronized (driver) {
			try {
				driver.wait(segundos * 1000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
	}

}
