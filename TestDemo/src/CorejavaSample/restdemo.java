package CorejavaSample;

public class restdemo
{

	public static void main(String[] args) {
	
	}/*
	

private void downloadUrlAsFile(
        final Map<String,String> cookies,
        final Map<String,String> headers,
        final String urlToDownload,
        final File outputPath,
        final String filename) throws IOException
        {

File outputFile = new File(outputPath.getPath(), filename);


final Response response = RestAssured.given().
                        headers(headers).
                        cookies(cookies).
                        when().
                        get(urlToDownload).
                        andReturn();

// check if the URL actually exists
if(response.getStatusCode() == 200){

if (outputFile.exists()) {
    outputFile.delete();
}

System.out.println("Downloaded an " + response.getHeader("Content-Type"));

byte[] fileContents = response.getBody().asByteArray();

// output contents to file
OutputStream outStream=null;

try {
    outStream = new FileOutputStream(outputFile);
    outStream.write(fileContents);
}catch(Exception e){
    System.out.println("Error writing file " + outputFile.getAbsolutePath());
}finally {
    if(outStream!=null){
        outStream.close();
    }
}
}
}
*/}

