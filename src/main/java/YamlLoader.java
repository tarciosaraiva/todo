import org.codehaus.jackson.map.ObjectMapper;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Map;

public class YamlLoader {

	public static void main(String[] args) throws IOException {
		final Yaml yaml = new Yaml();

		Reader reader = new FileReader(new File("/Users/tarcio/Projects/todo/src/main/java/initial.yml"));

		Map<String, Object> map = (Map<String, Object>) yaml.load(reader);

		for (String str : map.keySet()) {
			Object obj = map.get(str);

			ObjectMapper mapper = new ObjectMapper();
			String json = mapper.writeValueAsString(obj);

			System.out.println(json);
		}
	}

}
