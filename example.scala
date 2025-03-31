import lib_yyjson.all.*
import scalanative.libc.string.strlen
import scalanative.unsafe.*
import scalanative.unsigned.*

@main def hello = 

  val json = c"""{"name":"Mash","star":4,"hits":[2,2,1,3]}"""

  // Read JSON and get root
  val doc = yyjson_read(json, strlen(json), yyjson_read_flag(0.toUInt))
  val root = yyjson_doc_get_root(doc)

  val name = yyjson_obj_get(root, c"name")
  println(yyjson_get_type(name))
  printf("name: %s\n", fromCString(yyjson_get_str(name)))
  printf("name length:%d\n", yyjson_get_len(name).toInt)
