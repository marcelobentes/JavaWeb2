package arquivo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class EscreverJson {

	public static void main(String[] args) throws IOException {
		
		Usuario usuario1 = new Usuario ();
		usuario1.setNome("Marcelo");
		usuario1.setLogin("Marbot");
		usuario1.setSenha("asdasdas");
		usuario1.setCpf("454131");
		
		Usuario usuario2 = new Usuario ();
		
		usuario2.setNome("Thati");
		usuario2.setLogin("thatizinha");
		usuario2.setSenha("meuamor");
		usuario2.setCpf("00024454641");
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();//criar json melhor padrão
		String jsonUser = gson.toJson(usuarios); //adcionando lista no Json
		System.out.println(jsonUser);
		
		
		FileWriter fileWriter = new FileWriter("D:\\DESENVOLVIMENTO\\arquivos\\src\\arquivos\\filejson.json");
		
		fileWriter.write(jsonUser);
		fileWriter.flush();
		fileWriter.close();
		
		System.out.println("=========Lendo o arquivo Json==============");
		
		FileReader fileReader = new FileReader("D:\\DESENVOLVIMENTO\\arquivos\\src\\arquivos\\filejson.json");
		
		
		JsonArray jsonArray =  (JsonArray) JsonParser.parseReader(fileReader);
		List<Usuario> listUsuarios = new ArrayList<Usuario>();
		
		for (JsonElement jsonElement : jsonArray) {
			Usuario usuario = new Gson().fromJson(jsonElement, Usuario.class);
			
			listUsuarios.add(usuario);
			
		}
		
		System.out.println("Lista de usuario Json: " + listUsuarios );
		
		
	}
}
