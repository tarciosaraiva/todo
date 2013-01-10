import org.codehaus.jackson.map.ObjectMapper;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.util.Map;

public class YamlLoader {

	public static void main(String[] args) throws IOException {
		DumperOptions options = new DumperOptions();
		options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
		options.setDefaultScalarStyle(DumperOptions.ScalarStyle.DOUBLE_QUOTED);
		final Yaml yaml = new Yaml();
//		final Yaml yaml = new Yaml(new Loader(), new Dumper(options), new Resolver() {
//			/**
//			 * @see org.yaml.snakeyaml.resolver.Resolver#addImplicitResolvers()
//			 */
//			@Override
//			protected void addImplicitResolvers() {
//				addImplicitResolver(Tag.BOOL, BOOL, "yYnNtTfFoO");
//				// disable resolving of floats and integers
//				// addImplicitResolver(Tags.FLOAT, FLOAT, "-+0123456789.");
//				// addImplicitResolver(Tag.INT, INT, "-+0123456789");
//				addImplicitResolver(Tag.MERGE, MERGE, "<");
//				addImplicitResolver(Tag.NULL, NULL, "~nN\0");
//				addImplicitResolver(Tag.NULL, EMPTY, null);
//				addImplicitResolver(Tag.TIMESTAMP, TIMESTAMP, "0123456789");
//				addImplicitResolver(Tag.VALUE, VALUE, "=");
//			}
//		});

		YamlLoader yamlLoader = new YamlLoader();
		Map<String, Object> map = (Map<String, Object>) yaml.load(yamlLoader.getReader());

		for (String str : map.keySet()) {
			Object obj = map.get(str);

			System.out.println(str);

			ObjectMapper mapper = new ObjectMapper();
			String json = mapper.writeValueAsString(obj);
			System.out.println(json);
		}
	}

	private Reader reader;

	public YamlLoader() throws FileNotFoundException {
		reader = new FileReader(new File("/Users/tarcio/Projects/todo/src/main/java/initial.yml"));
	}

	public Reader getReader() {
		return reader;
	}
}
