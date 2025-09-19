package aqa.Task5;

//Serialization-Deserialization:
// a) Make some complex models using your variant.
// b) Make it serializable.
// c) Read JSON from “input.json”
// d) and deserialize it to POJO.
// e) Then change a few fields and save it to “output.json”.
// f) Do the same for XML. Stream:
// a) Generate 10 random objects using a class from a previous task
// b) Sort it using any two fields using stream.
// c) Filter it by any two fields custom filter.
// d) Collect it to List with *main field(s).
// 3. Write a maven command for executing one of your tasks with arguments (number of elements)
// { "name": "Alice", "age": 25, "address":
// { "city": "San Francisco", "state": "CA", "zip": 94107 } }
// <person> <name>Alice</name>
// <age>25</age> <address>
// <city>San Francisco</city> <state>CA</state>
// <zip>94107</zip> </address> </person>

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class Task5 {
    private static final String INPUT_FILE_JSON_PATH = "C:\\Users\\viket\\IdeaProjects\\JAVA_4AT_31\\java_aqa\\src\\main\\resources\\input.json";
    private static final String OUTPUT_FILE_JSON_PATH = "C:\\Users\\viket\\IdeaProjects\\JAVA_4AT_31\\java_aqa\\src\\main\\resources\\output.json";
    private static final String INPUT_FILE_XML_PATH = "C:\\Users\\viket\\IdeaProjects\\JAVA_4AT_31\\java_aqa\\src\\main\\resources\\input.xml";
    private static final String OUTPUT_FILE_XML_PATH = "C:\\Users\\viket\\IdeaProjects\\JAVA_4AT_31\\java_aqa\\src\\main\\resources\\output.xml";

    public static void main(String[] args) throws Exception  {
        ObjectMapper mapper = new ObjectMapper();

        User user = mapper.readValue(new File(INPUT_FILE_JSON_PATH), User.class);
        System.out.println("User JSON: " + user);

        user.setName("Katty Perry");
        user.getAddress().setCity("Zhytomyr");
        System.out.println("Modified User: " + user);

        mapper.writerWithDefaultPrettyPrinter().writeValue(new File(OUTPUT_FILE_JSON_PATH), user);

        XmlMapper xmlMapper = new XmlMapper();
        User user1 = xmlMapper.readValue(new File(INPUT_FILE_XML_PATH),User.class);
        System.out.println("User XML: " + user);

        user.setAge(80);
        user.getAddress().setState("HW");

        xmlMapper.writerWithDefaultPrettyPrinter().writeValue(new File(OUTPUT_FILE_XML_PATH), user);
    }
}
