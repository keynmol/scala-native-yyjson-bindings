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