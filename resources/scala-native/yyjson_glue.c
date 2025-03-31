#include <string.h>
#include "yyjson.h"

void __sn_wrap_lib_yyjson_yyjson_arr_iter_with(yyjson_val * arr, yyjson_arr_iter *____return) {
  yyjson_arr_iter ____ret = yyjson_arr_iter_with(arr);
  memcpy(____return, &____ret, sizeof(yyjson_arr_iter));
}


void __sn_wrap_lib_yyjson_yyjson_mut_arr_iter_with(yyjson_mut_val * arr, yyjson_mut_arr_iter *____return) {
  yyjson_mut_arr_iter ____ret = yyjson_mut_arr_iter_with(arr);
  memcpy(____return, &____ret, sizeof(yyjson_mut_arr_iter));
}


void __sn_wrap_lib_yyjson_yyjson_mut_obj_iter_with(yyjson_mut_val * obj, yyjson_mut_obj_iter *____return) {
  yyjson_mut_obj_iter ____ret = yyjson_mut_obj_iter_with(obj);
  memcpy(____return, &____ret, sizeof(yyjson_mut_obj_iter));
}


void __sn_wrap_lib_yyjson_yyjson_obj_iter_with(yyjson_val * obj, yyjson_obj_iter *____return) {
  yyjson_obj_iter ____ret = yyjson_obj_iter_with(obj);
  memcpy(____return, &____ret, sizeof(yyjson_obj_iter));
}

size_t __sn_wrap_lib_yyjson_yyjson_get_len(void* val) {
  return yyjson_get_len(val);
}

yyjson_val* __sn_wrap_lib_yyjson_yyjson_doc_get_root(yyjson_doc* val) {
  return yyjson_doc_get_root(val);
}

yyjson_val* __sn_wrap_lib_yyjson_yyjson_obj_get(yyjson_val* obj, const char* key) {
  return yyjson_obj_get(obj, key);
}

const char* __sn_wrap_lib_yyjson_yyjson_get_str(yyjson_val* str) {
  return yyjson_get_str(str);
}


yyjson_doc* __sn_wrap_lib_yyjson_yyjson_read(const char* dat, size_t len, yyjson_read_flag flg) {
  return yyjson_read(dat, len, flg);
}

yyjson_type __sn_wrap_lib_yyjson_yyjson_get_type(yyjson_val* val) {
  return yyjson_get_type(val);
}
