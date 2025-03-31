package lib_yyjson

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

object aliases:
  import _root_.lib_yyjson.aliases.*
  import _root_.lib_yyjson.structs.*
  import _root_.lib_yyjson.unions.*
  type FILE = libc.stdio.FILE
  object FILE:
    val _tag: Tag[FILE] = summon[Tag[libc.stdio.FILE]]
    inline def apply(inline o: libc.stdio.FILE): FILE = o
    extension (v: FILE)
      inline def value: libc.stdio.FILE = v

  type int16_t = scala.Short
  object int16_t:
    val _tag: Tag[int16_t] = summon[Tag[scala.Short]]
    inline def apply(inline o: scala.Short): int16_t = o
    extension (v: int16_t)
      inline def value: scala.Short = v

  type int32_t = scala.scalanative.unsafe.CInt
  object int32_t:
    val _tag: Tag[int32_t] = summon[Tag[scala.scalanative.unsafe.CInt]]
    inline def apply(inline o: scala.scalanative.unsafe.CInt): int32_t = o
    extension (v: int32_t)
      inline def value: scala.scalanative.unsafe.CInt = v

  type int64_t = scala.Long
  object int64_t:
    val _tag: Tag[int64_t] = summon[Tag[scala.Long]]
    inline def apply(inline o: scala.Long): int64_t = o
    extension (v: int64_t)
      inline def value: scala.Long = v

  type int8_t = scala.scalanative.unsafe.CChar
  object int8_t:
    val _tag: Tag[int8_t] = summon[Tag[scala.scalanative.unsafe.CChar]]
    inline def apply(inline o: scala.scalanative.unsafe.CChar): int8_t = o
    extension (v: int8_t)
      inline def value: scala.scalanative.unsafe.CChar = v

  type size_t = libc.stddef.size_t
  object size_t:
    val _tag: Tag[size_t] = summon[Tag[libc.stddef.size_t]]
    inline def apply(inline o: libc.stddef.size_t): size_t = o
    extension (v: size_t)
      inline def value: libc.stddef.size_t = v

  type uint16_t = scala.scalanative.unsigned.UShort
  object uint16_t:
    val _tag: Tag[uint16_t] = summon[Tag[scala.scalanative.unsigned.UShort]]
    inline def apply(inline o: scala.scalanative.unsigned.UShort): uint16_t = o
    extension (v: uint16_t)
      inline def value: scala.scalanative.unsigned.UShort = v

  type uint32_t = scala.scalanative.unsigned.UInt
  object uint32_t:
    val _tag: Tag[uint32_t] = summon[Tag[scala.scalanative.unsigned.UInt]]
    inline def apply(inline o: scala.scalanative.unsigned.UInt): uint32_t = o
    extension (v: uint32_t)
      inline def value: scala.scalanative.unsigned.UInt = v

  type uint64_t = scala.scalanative.unsigned.ULong
  object uint64_t:
    val _tag: Tag[uint64_t] = summon[Tag[scala.scalanative.unsigned.ULong]]
    inline def apply(inline o: scala.scalanative.unsigned.ULong): uint64_t = o
    extension (v: uint64_t)
      inline def value: scala.scalanative.unsigned.ULong = v

  type uint8_t = scala.scalanative.unsigned.UByte
  object uint8_t:
    val _tag: Tag[uint8_t] = summon[Tag[scala.scalanative.unsigned.UByte]]
    inline def apply(inline o: scala.scalanative.unsigned.UByte): uint8_t = o
    extension (v: uint8_t)
      inline def value: scala.scalanative.unsigned.UByte = v

  /**
   * Result code for JSON patch.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  type yyjson_patch_code = uint32_t
  object yyjson_patch_code:
    given _tag: Tag[yyjson_patch_code] = uint32_t._tag
    inline def apply(inline o: uint32_t): yyjson_patch_code = o
    extension (v: yyjson_patch_code)
      inline def value: uint32_t = v

  /**
   * JSON Pointer error code.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  type yyjson_ptr_code = uint32_t
  object yyjson_ptr_code:
    given _tag: Tag[yyjson_ptr_code] = uint32_t._tag
    inline def apply(inline o: uint32_t): yyjson_ptr_code = o
    extension (v: yyjson_ptr_code)
      inline def value: uint32_t = v

  /**
   * Result code for JSON reader.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  type yyjson_read_code = uint32_t
  object yyjson_read_code:
    given _tag: Tag[yyjson_read_code] = uint32_t._tag
    inline def apply(inline o: uint32_t): yyjson_read_code = o
    extension (v: yyjson_read_code)
      inline def value: uint32_t = v

  /**
   * Run-time options for JSON reader.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  type yyjson_read_flag = uint32_t
  object yyjson_read_flag:
    given _tag: Tag[yyjson_read_flag] = uint32_t._tag
    inline def apply(inline o: uint32_t): yyjson_read_flag = o
    extension (v: yyjson_read_flag)
      inline def value: uint32_t = v

  /**
   * Subtype of a JSON value (2 bit).

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  type yyjson_subtype = uint8_t
  object yyjson_subtype:
    given _tag: Tag[yyjson_subtype] = uint8_t._tag
    inline def apply(inline o: uint8_t): yyjson_subtype = o
    extension (v: yyjson_subtype)
      inline def value: uint8_t = v

  /**
   * Type of a JSON value (3 bit).

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  type yyjson_type = uint8_t
  object yyjson_type:
    given _tag: Tag[yyjson_type] = uint8_t._tag
    inline def apply(inline o: uint8_t): yyjson_type = o
    extension (v: yyjson_type)
      inline def value: uint8_t = v

  /**
   * Result code for JSON writer

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  type yyjson_write_code = uint32_t
  object yyjson_write_code:
    given _tag: Tag[yyjson_write_code] = uint32_t._tag
    inline def apply(inline o: uint32_t): yyjson_write_code = o
    extension (v: yyjson_write_code)
      inline def value: uint32_t = v

  /**
   * Run-time options for JSON writer.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  type yyjson_write_flag = uint32_t
  object yyjson_write_flag:
    given _tag: Tag[yyjson_write_flag] = uint32_t._tag
    inline def apply(inline o: uint32_t): yyjson_write_flag = o
    extension (v: yyjson_write_flag)
      inline def value: uint32_t = v

object structs:
  import _root_.lib_yyjson.aliases.*
  import _root_.lib_yyjson.structs.*
  import _root_.lib_yyjson.unions.*
  /**
   * A memory allocator.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  opaque type yyjson_alc = CStruct4[CFuncPtr2[Ptr[Byte], size_t, Ptr[Byte]], CFuncPtr4[Ptr[Byte], Ptr[Byte], size_t, size_t, Ptr[Byte]], CFuncPtr2[Ptr[Byte], Ptr[Byte], Unit], Ptr[Byte]]
  object yyjson_alc:
    given _tag: Tag[yyjson_alc] = Tag.materializeCStruct4Tag[CFuncPtr2[Ptr[Byte], size_t, Ptr[Byte]], CFuncPtr4[Ptr[Byte], Ptr[Byte], size_t, size_t, Ptr[Byte]], CFuncPtr2[Ptr[Byte], Ptr[Byte], Unit], Ptr[Byte]]
    def apply()(using Zone): Ptr[yyjson_alc] = scala.scalanative.unsafe.alloc[yyjson_alc](1)
    def apply(malloc : CFuncPtr2[Ptr[Byte], size_t, Ptr[Byte]], realloc : CFuncPtr4[Ptr[Byte], Ptr[Byte], size_t, size_t, Ptr[Byte]], free : CFuncPtr2[Ptr[Byte], Ptr[Byte], Unit], ctx : Ptr[Byte])(using Zone): Ptr[yyjson_alc] =
      val ____ptr = apply()
      (!____ptr).malloc = malloc
      (!____ptr).realloc = realloc
      (!____ptr).free = free
      (!____ptr).ctx = ctx
      ____ptr
    extension (struct: yyjson_alc)
      def malloc : CFuncPtr2[Ptr[Byte], size_t, Ptr[Byte]] = struct._1
      def malloc_=(value: CFuncPtr2[Ptr[Byte], size_t, Ptr[Byte]]): Unit = !struct.at1 = value
      def realloc : CFuncPtr4[Ptr[Byte], Ptr[Byte], size_t, size_t, Ptr[Byte]] = struct._2
      def realloc_=(value: CFuncPtr4[Ptr[Byte], Ptr[Byte], size_t, size_t, Ptr[Byte]]): Unit = !struct.at2 = value
      def free : CFuncPtr2[Ptr[Byte], Ptr[Byte], Unit] = struct._3
      def free_=(value: CFuncPtr2[Ptr[Byte], Ptr[Byte], Unit]): Unit = !struct.at3 = value
      def ctx : Ptr[Byte] = struct._4
      def ctx_=(value: Ptr[Byte]): Unit = !struct.at4 = value

  /**
   * A JSON array iterator.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  opaque type yyjson_arr_iter = CStruct3[size_t, size_t, Ptr[yyjson_val]]
  object yyjson_arr_iter:
    given _tag: Tag[yyjson_arr_iter] = Tag.materializeCStruct3Tag[size_t, size_t, Ptr[yyjson_val]]
    def apply()(using Zone): Ptr[yyjson_arr_iter] = scala.scalanative.unsafe.alloc[yyjson_arr_iter](1)
    def apply(idx : size_t, max : size_t, cur : Ptr[yyjson_val])(using Zone): Ptr[yyjson_arr_iter] =
      val ____ptr = apply()
      (!____ptr).idx = idx
      (!____ptr).max = max
      (!____ptr).cur = cur
      ____ptr
    extension (struct: yyjson_arr_iter)
      def idx : size_t = struct._1
      def idx_=(value: size_t): Unit = !struct.at1 = value
      def max : size_t = struct._2
      def max_=(value: size_t): Unit = !struct.at2 = value
      def cur : Ptr[yyjson_val] = struct._3
      def cur_=(value: Ptr[yyjson_val]): Unit = !struct.at3 = value

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  opaque type yyjson_doc = CStruct5[Ptr[yyjson_val], yyjson_alc, size_t, size_t, CString]
  object yyjson_doc:
    given _tag: Tag[yyjson_doc] = Tag.materializeCStruct5Tag[Ptr[yyjson_val], yyjson_alc, size_t, size_t, CString]
    def apply()(using Zone): Ptr[yyjson_doc] = scala.scalanative.unsafe.alloc[yyjson_doc](1)
    def apply(root : Ptr[yyjson_val], alc : yyjson_alc, dat_read : size_t, val_read : size_t, str_pool : CString)(using Zone): Ptr[yyjson_doc] =
      val ____ptr = apply()
      (!____ptr).root = root
      (!____ptr).alc = alc
      (!____ptr).dat_read = dat_read
      (!____ptr).val_read = val_read
      (!____ptr).str_pool = str_pool
      ____ptr
    extension (struct: yyjson_doc)
      def root : Ptr[yyjson_val] = struct._1
      def root_=(value: Ptr[yyjson_val]): Unit = !struct.at1 = value
      def alc : yyjson_alc = struct._2
      def alc_=(value: yyjson_alc): Unit = !struct.at2 = value
      def dat_read : size_t = struct._3
      def dat_read_=(value: size_t): Unit = !struct.at3 = value
      def val_read : size_t = struct._4
      def val_read_=(value: size_t): Unit = !struct.at4 = value
      def str_pool : CString = struct._5
      def str_pool_=(value: CString): Unit = !struct.at5 = value

  /**
   * A mutable JSON array iterator.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  opaque type yyjson_mut_arr_iter = CStruct5[size_t, size_t, Ptr[Byte], Ptr[Byte], Ptr[Byte]]
  object yyjson_mut_arr_iter:
    given _tag: Tag[yyjson_mut_arr_iter] = Tag.materializeCStruct5Tag[size_t, size_t, Ptr[Byte], Ptr[Byte], Ptr[Byte]]
    def apply()(using Zone): Ptr[yyjson_mut_arr_iter] = scala.scalanative.unsafe.alloc[yyjson_mut_arr_iter](1)
    def apply(idx : size_t, max : size_t, cur : Ptr[yyjson_mut_val], pre : Ptr[yyjson_mut_val], arr : Ptr[yyjson_mut_val])(using Zone): Ptr[yyjson_mut_arr_iter] =
      val ____ptr = apply()
      (!____ptr).idx = idx
      (!____ptr).max = max
      (!____ptr).cur = cur
      (!____ptr).pre = pre
      (!____ptr).arr = arr
      ____ptr
    extension (struct: yyjson_mut_arr_iter)
      def idx : size_t = struct._1
      def idx_=(value: size_t): Unit = !struct.at1 = value
      def max : size_t = struct._2
      def max_=(value: size_t): Unit = !struct.at2 = value
      def cur : Ptr[yyjson_mut_val] = struct._3.asInstanceOf[Ptr[yyjson_mut_val]]
      def cur_=(value: Ptr[yyjson_mut_val]): Unit = !struct.at3 = value.asInstanceOf[Ptr[Byte]]
      def pre : Ptr[yyjson_mut_val] = struct._4.asInstanceOf[Ptr[yyjson_mut_val]]
      def pre_=(value: Ptr[yyjson_mut_val]): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
      def arr : Ptr[yyjson_mut_val] = struct._5.asInstanceOf[Ptr[yyjson_mut_val]]
      def arr_=(value: Ptr[yyjson_mut_val]): Unit = !struct.at5 = value.asInstanceOf[Ptr[Byte]]

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  opaque type yyjson_mut_doc = CStruct4[Ptr[Byte], yyjson_alc, yyjson_str_pool, yyjson_val_pool]
  object yyjson_mut_doc:
    given _tag: Tag[yyjson_mut_doc] = Tag.materializeCStruct4Tag[Ptr[Byte], yyjson_alc, yyjson_str_pool, yyjson_val_pool]
    def apply()(using Zone): Ptr[yyjson_mut_doc] = scala.scalanative.unsafe.alloc[yyjson_mut_doc](1)
    def apply(root : Ptr[yyjson_mut_val], alc : yyjson_alc, str_pool : yyjson_str_pool, val_pool : yyjson_val_pool)(using Zone): Ptr[yyjson_mut_doc] =
      val ____ptr = apply()
      (!____ptr).root = root
      (!____ptr).alc = alc
      (!____ptr).str_pool = str_pool
      (!____ptr).val_pool = val_pool
      ____ptr
    extension (struct: yyjson_mut_doc)
      def root : Ptr[yyjson_mut_val] = struct._1.asInstanceOf[Ptr[yyjson_mut_val]]
      def root_=(value: Ptr[yyjson_mut_val]): Unit = !struct.at1 = value.asInstanceOf[Ptr[Byte]]
      def alc : yyjson_alc = struct._2
      def alc_=(value: yyjson_alc): Unit = !struct.at2 = value
      def str_pool : yyjson_str_pool = struct._3
      def str_pool_=(value: yyjson_str_pool): Unit = !struct.at3 = value
      def val_pool : yyjson_val_pool = struct._4
      def val_pool_=(value: yyjson_val_pool): Unit = !struct.at4 = value

  /**
   * A mutable JSON object iterator.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  opaque type yyjson_mut_obj_iter = CStruct5[size_t, size_t, Ptr[Byte], Ptr[Byte], Ptr[Byte]]
  object yyjson_mut_obj_iter:
    given _tag: Tag[yyjson_mut_obj_iter] = Tag.materializeCStruct5Tag[size_t, size_t, Ptr[Byte], Ptr[Byte], Ptr[Byte]]
    def apply()(using Zone): Ptr[yyjson_mut_obj_iter] = scala.scalanative.unsafe.alloc[yyjson_mut_obj_iter](1)
    def apply(idx : size_t, max : size_t, cur : Ptr[yyjson_mut_val], pre : Ptr[yyjson_mut_val], obj : Ptr[yyjson_mut_val])(using Zone): Ptr[yyjson_mut_obj_iter] =
      val ____ptr = apply()
      (!____ptr).idx = idx
      (!____ptr).max = max
      (!____ptr).cur = cur
      (!____ptr).pre = pre
      (!____ptr).obj = obj
      ____ptr
    extension (struct: yyjson_mut_obj_iter)
      def idx : size_t = struct._1
      def idx_=(value: size_t): Unit = !struct.at1 = value
      def max : size_t = struct._2
      def max_=(value: size_t): Unit = !struct.at2 = value
      def cur : Ptr[yyjson_mut_val] = struct._3.asInstanceOf[Ptr[yyjson_mut_val]]
      def cur_=(value: Ptr[yyjson_mut_val]): Unit = !struct.at3 = value.asInstanceOf[Ptr[Byte]]
      def pre : Ptr[yyjson_mut_val] = struct._4.asInstanceOf[Ptr[yyjson_mut_val]]
      def pre_=(value: Ptr[yyjson_mut_val]): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
      def obj : Ptr[yyjson_mut_val] = struct._5.asInstanceOf[Ptr[yyjson_mut_val]]
      def obj_=(value: Ptr[yyjson_mut_val]): Unit = !struct.at5 = value.asInstanceOf[Ptr[Byte]]

  /**
   * Mutable JSON value, 24 bytes. The 'tag' and 'uni' field is same as immutable value. The 'next' field links all elements inside the container to be a cycle.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  opaque type yyjson_mut_val = CStruct3[uint64_t, yyjson_val_uni, Ptr[Byte]]
  object yyjson_mut_val:
    given _tag: Tag[yyjson_mut_val] = Tag.materializeCStruct3Tag[uint64_t, yyjson_val_uni, Ptr[Byte]]
    def apply()(using Zone): Ptr[yyjson_mut_val] = scala.scalanative.unsafe.alloc[yyjson_mut_val](1)
    def apply(tag : uint64_t, uni : yyjson_val_uni, next : Ptr[yyjson_mut_val])(using Zone): Ptr[yyjson_mut_val] =
      val ____ptr = apply()
      (!____ptr).tag = tag
      (!____ptr).uni = uni
      (!____ptr).next = next
      ____ptr
    extension (struct: yyjson_mut_val)
      def tag : uint64_t = struct._1
      def tag_=(value: uint64_t): Unit = !struct.at1 = value
      def uni : yyjson_val_uni = struct._2
      def uni_=(value: yyjson_val_uni): Unit = !struct.at2 = value
      def next : Ptr[yyjson_mut_val] = struct._3.asInstanceOf[Ptr[yyjson_mut_val]]
      def next_=(value: Ptr[yyjson_mut_val]): Unit = !struct.at3 = value.asInstanceOf[Ptr[Byte]]

  /**
   * A JSON object iterator.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  opaque type yyjson_obj_iter = CStruct4[size_t, size_t, Ptr[yyjson_val], Ptr[yyjson_val]]
  object yyjson_obj_iter:
    given _tag: Tag[yyjson_obj_iter] = Tag.materializeCStruct4Tag[size_t, size_t, Ptr[yyjson_val], Ptr[yyjson_val]]
    def apply()(using Zone): Ptr[yyjson_obj_iter] = scala.scalanative.unsafe.alloc[yyjson_obj_iter](1)
    def apply(idx : size_t, max : size_t, cur : Ptr[yyjson_val], obj : Ptr[yyjson_val])(using Zone): Ptr[yyjson_obj_iter] =
      val ____ptr = apply()
      (!____ptr).idx = idx
      (!____ptr).max = max
      (!____ptr).cur = cur
      (!____ptr).obj = obj
      ____ptr
    extension (struct: yyjson_obj_iter)
      def idx : size_t = struct._1
      def idx_=(value: size_t): Unit = !struct.at1 = value
      def max : size_t = struct._2
      def max_=(value: size_t): Unit = !struct.at2 = value
      def cur : Ptr[yyjson_val] = struct._3
      def cur_=(value: Ptr[yyjson_val]): Unit = !struct.at3 = value
      def obj : Ptr[yyjson_val] = struct._4
      def obj_=(value: Ptr[yyjson_val]): Unit = !struct.at4 = value

  /**
   * Error information for JSON patch.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  opaque type yyjson_patch_err = CStruct4[yyjson_patch_code, size_t, CString, yyjson_ptr_err]
  object yyjson_patch_err:
    given _tag: Tag[yyjson_patch_err] = Tag.materializeCStruct4Tag[yyjson_patch_code, size_t, CString, yyjson_ptr_err]
    def apply()(using Zone): Ptr[yyjson_patch_err] = scala.scalanative.unsafe.alloc[yyjson_patch_err](1)
    def apply(code : yyjson_patch_code, idx : size_t, msg : CString, ptr : yyjson_ptr_err)(using Zone): Ptr[yyjson_patch_err] =
      val ____ptr = apply()
      (!____ptr).code = code
      (!____ptr).idx = idx
      (!____ptr).msg = msg
      (!____ptr).ptr = ptr
      ____ptr
    extension (struct: yyjson_patch_err)
      def code : yyjson_patch_code = struct._1
      def code_=(value: yyjson_patch_code): Unit = !struct.at1 = value
      def idx : size_t = struct._2
      def idx_=(value: size_t): Unit = !struct.at2 = value
      def msg : CString = struct._3
      def msg_=(value: CString): Unit = !struct.at3 = value
      def ptr : yyjson_ptr_err = struct._4
      def ptr_=(value: yyjson_ptr_err): Unit = !struct.at4 = value

  /**
   * A context for JSON pointer operation.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  opaque type yyjson_ptr_ctx = CStruct3[Ptr[Byte], Ptr[Byte], Ptr[Byte]]
  object yyjson_ptr_ctx:
    given _tag: Tag[yyjson_ptr_ctx] = Tag.materializeCStruct3Tag[Ptr[Byte], Ptr[Byte], Ptr[Byte]]
    def apply()(using Zone): Ptr[yyjson_ptr_ctx] = scala.scalanative.unsafe.alloc[yyjson_ptr_ctx](1)
    def apply(ctn : Ptr[yyjson_mut_val], pre : Ptr[yyjson_mut_val], old : Ptr[yyjson_mut_val])(using Zone): Ptr[yyjson_ptr_ctx] =
      val ____ptr = apply()
      (!____ptr).ctn = ctn
      (!____ptr).pre = pre
      (!____ptr).old = old
      ____ptr
    extension (struct: yyjson_ptr_ctx)
      def ctn : Ptr[yyjson_mut_val] = struct._1.asInstanceOf[Ptr[yyjson_mut_val]]
      def ctn_=(value: Ptr[yyjson_mut_val]): Unit = !struct.at1 = value.asInstanceOf[Ptr[Byte]]
      def pre : Ptr[yyjson_mut_val] = struct._2.asInstanceOf[Ptr[yyjson_mut_val]]
      def pre_=(value: Ptr[yyjson_mut_val]): Unit = !struct.at2 = value.asInstanceOf[Ptr[Byte]]
      def old : Ptr[yyjson_mut_val] = struct._3.asInstanceOf[Ptr[yyjson_mut_val]]
      def old_=(value: Ptr[yyjson_mut_val]): Unit = !struct.at3 = value.asInstanceOf[Ptr[Byte]]

  /**
   * Error information for JSON pointer.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  opaque type yyjson_ptr_err = CStruct3[yyjson_ptr_code, CString, size_t]
  object yyjson_ptr_err:
    given _tag: Tag[yyjson_ptr_err] = Tag.materializeCStruct3Tag[yyjson_ptr_code, CString, size_t]
    def apply()(using Zone): Ptr[yyjson_ptr_err] = scala.scalanative.unsafe.alloc[yyjson_ptr_err](1)
    def apply(code : yyjson_ptr_code, msg : CString, pos : size_t)(using Zone): Ptr[yyjson_ptr_err] =
      val ____ptr = apply()
      (!____ptr).code = code
      (!____ptr).msg = msg
      (!____ptr).pos = pos
      ____ptr
    extension (struct: yyjson_ptr_err)
      def code : yyjson_ptr_code = struct._1
      def code_=(value: yyjson_ptr_code): Unit = !struct.at1 = value
      def msg : CString = struct._2
      def msg_=(value: CString): Unit = !struct.at2 = value
      def pos : size_t = struct._3
      def pos_=(value: size_t): Unit = !struct.at3 = value

  /**
   * Error information for JSON reader.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  opaque type yyjson_read_err = CStruct3[yyjson_read_code, CString, size_t]
  object yyjson_read_err:
    given _tag: Tag[yyjson_read_err] = Tag.materializeCStruct3Tag[yyjson_read_code, CString, size_t]
    def apply()(using Zone): Ptr[yyjson_read_err] = scala.scalanative.unsafe.alloc[yyjson_read_err](1)
    def apply(code : yyjson_read_code, msg : CString, pos : size_t)(using Zone): Ptr[yyjson_read_err] =
      val ____ptr = apply()
      (!____ptr).code = code
      (!____ptr).msg = msg
      (!____ptr).pos = pos
      ____ptr
    extension (struct: yyjson_read_err)
      def code : yyjson_read_code = struct._1
      def code_=(value: yyjson_read_code): Unit = !struct.at1 = value
      def msg : CString = struct._2
      def msg_=(value: CString): Unit = !struct.at2 = value
      def pos : size_t = struct._3
      def pos_=(value: size_t): Unit = !struct.at3 = value

  /**
   * A memory chunk in string memory pool.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  opaque type yyjson_str_chunk = CStruct2[Ptr[Byte], size_t]
  object yyjson_str_chunk:
    given _tag: Tag[yyjson_str_chunk] = Tag.materializeCStruct2Tag[Ptr[Byte], size_t]
    def apply()(using Zone): Ptr[yyjson_str_chunk] = scala.scalanative.unsafe.alloc[yyjson_str_chunk](1)
    def apply(next : Ptr[yyjson_str_chunk], chunk_size : size_t)(using Zone): Ptr[yyjson_str_chunk] =
      val ____ptr = apply()
      (!____ptr).next = next
      (!____ptr).chunk_size = chunk_size
      ____ptr
    extension (struct: yyjson_str_chunk)
      def next : Ptr[yyjson_str_chunk] = struct._1.asInstanceOf[Ptr[yyjson_str_chunk]]
      def next_=(value: Ptr[yyjson_str_chunk]): Unit = !struct.at1 = value.asInstanceOf[Ptr[Byte]]
      def chunk_size : size_t = struct._2
      def chunk_size_=(value: size_t): Unit = !struct.at2 = value

  /**
   * A memory pool to hold all strings in a mutable document.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  opaque type yyjson_str_pool = CStruct5[CString, CString, size_t, size_t, Ptr[Byte]]
  object yyjson_str_pool:
    given _tag: Tag[yyjson_str_pool] = Tag.materializeCStruct5Tag[CString, CString, size_t, size_t, Ptr[Byte]]
    def apply()(using Zone): Ptr[yyjson_str_pool] = scala.scalanative.unsafe.alloc[yyjson_str_pool](1)
    def apply(cur : CString, end : CString, chunk_size : size_t, chunk_size_max : size_t, chunks : Ptr[yyjson_str_chunk])(using Zone): Ptr[yyjson_str_pool] =
      val ____ptr = apply()
      (!____ptr).cur = cur
      (!____ptr).end = end
      (!____ptr).chunk_size = chunk_size
      (!____ptr).chunk_size_max = chunk_size_max
      (!____ptr).chunks = chunks
      ____ptr
    extension (struct: yyjson_str_pool)
      def cur : CString = struct._1
      def cur_=(value: CString): Unit = !struct.at1 = value
      def end : CString = struct._2
      def end_=(value: CString): Unit = !struct.at2 = value
      def chunk_size : size_t = struct._3
      def chunk_size_=(value: size_t): Unit = !struct.at3 = value
      def chunk_size_max : size_t = struct._4
      def chunk_size_max_=(value: size_t): Unit = !struct.at4 = value
      def chunks : Ptr[yyjson_str_chunk] = struct._5.asInstanceOf[Ptr[yyjson_str_chunk]]
      def chunks_=(value: Ptr[yyjson_str_chunk]): Unit = !struct.at5 = value.asInstanceOf[Ptr[Byte]]

  /**
   * Immutable JSON value, 16 bytes.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  opaque type yyjson_val = CStruct2[uint64_t, yyjson_val_uni]
  object yyjson_val:
    given _tag: Tag[yyjson_val] = Tag.materializeCStruct2Tag[uint64_t, yyjson_val_uni]
    def apply()(using Zone): Ptr[yyjson_val] = scala.scalanative.unsafe.alloc[yyjson_val](1)
    def apply(tag : uint64_t, uni : yyjson_val_uni)(using Zone): Ptr[yyjson_val] =
      val ____ptr = apply()
      (!____ptr).tag = tag
      (!____ptr).uni = uni
      ____ptr
    extension (struct: yyjson_val)
      def tag : uint64_t = struct._1
      def tag_=(value: uint64_t): Unit = !struct.at1 = value
      def uni : yyjson_val_uni = struct._2
      def uni_=(value: yyjson_val_uni): Unit = !struct.at2 = value

  /**
   * A memory chunk in value memory pool. `sizeof(yyjson_val_chunk)` should not larger than `sizeof(yyjson_mut_val)`.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  opaque type yyjson_val_chunk = CStruct2[Ptr[Byte], size_t]
  object yyjson_val_chunk:
    given _tag: Tag[yyjson_val_chunk] = Tag.materializeCStruct2Tag[Ptr[Byte], size_t]
    def apply()(using Zone): Ptr[yyjson_val_chunk] = scala.scalanative.unsafe.alloc[yyjson_val_chunk](1)
    def apply(next : Ptr[yyjson_val_chunk], chunk_size : size_t)(using Zone): Ptr[yyjson_val_chunk] =
      val ____ptr = apply()
      (!____ptr).next = next
      (!____ptr).chunk_size = chunk_size
      ____ptr
    extension (struct: yyjson_val_chunk)
      def next : Ptr[yyjson_val_chunk] = struct._1.asInstanceOf[Ptr[yyjson_val_chunk]]
      def next_=(value: Ptr[yyjson_val_chunk]): Unit = !struct.at1 = value.asInstanceOf[Ptr[Byte]]
      def chunk_size : size_t = struct._2
      def chunk_size_=(value: size_t): Unit = !struct.at2 = value

  /**
   * A memory pool to hold all values in a mutable document.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  opaque type yyjson_val_pool = CStruct5[Ptr[Byte], Ptr[Byte], size_t, size_t, Ptr[Byte]]
  object yyjson_val_pool:
    given _tag: Tag[yyjson_val_pool] = Tag.materializeCStruct5Tag[Ptr[Byte], Ptr[Byte], size_t, size_t, Ptr[Byte]]
    def apply()(using Zone): Ptr[yyjson_val_pool] = scala.scalanative.unsafe.alloc[yyjson_val_pool](1)
    def apply(cur : Ptr[yyjson_mut_val], end : Ptr[yyjson_mut_val], chunk_size : size_t, chunk_size_max : size_t, chunks : Ptr[yyjson_val_chunk])(using Zone): Ptr[yyjson_val_pool] =
      val ____ptr = apply()
      (!____ptr).cur = cur
      (!____ptr).end = end
      (!____ptr).chunk_size = chunk_size
      (!____ptr).chunk_size_max = chunk_size_max
      (!____ptr).chunks = chunks
      ____ptr
    extension (struct: yyjson_val_pool)
      def cur : Ptr[yyjson_mut_val] = struct._1.asInstanceOf[Ptr[yyjson_mut_val]]
      def cur_=(value: Ptr[yyjson_mut_val]): Unit = !struct.at1 = value.asInstanceOf[Ptr[Byte]]
      def end : Ptr[yyjson_mut_val] = struct._2.asInstanceOf[Ptr[yyjson_mut_val]]
      def end_=(value: Ptr[yyjson_mut_val]): Unit = !struct.at2 = value.asInstanceOf[Ptr[Byte]]
      def chunk_size : size_t = struct._3
      def chunk_size_=(value: size_t): Unit = !struct.at3 = value
      def chunk_size_max : size_t = struct._4
      def chunk_size_max_=(value: size_t): Unit = !struct.at4 = value
      def chunks : Ptr[yyjson_val_chunk] = struct._5.asInstanceOf[Ptr[yyjson_val_chunk]]
      def chunks_=(value: Ptr[yyjson_val_chunk]): Unit = !struct.at5 = value.asInstanceOf[Ptr[Byte]]

  /**
   * Error information for JSON writer.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  opaque type yyjson_write_err = CStruct2[yyjson_write_code, CString]
  object yyjson_write_err:
    given _tag: Tag[yyjson_write_err] = Tag.materializeCStruct2Tag[yyjson_write_code, CString]
    def apply()(using Zone): Ptr[yyjson_write_err] = scala.scalanative.unsafe.alloc[yyjson_write_err](1)
    def apply(code : yyjson_write_code, msg : CString)(using Zone): Ptr[yyjson_write_err] =
      val ____ptr = apply()
      (!____ptr).code = code
      (!____ptr).msg = msg
      ____ptr
    extension (struct: yyjson_write_err)
      def code : yyjson_write_code = struct._1
      def code_=(value: yyjson_write_code): Unit = !struct.at1 = value
      def msg : CString = struct._2
      def msg_=(value: CString): Unit = !struct.at2 = value

object unions:
  import _root_.lib_yyjson.aliases.*
  import _root_.lib_yyjson.structs.*
  import _root_.lib_yyjson.unions.*
  /**
   * Payload of a JSON value (8 bytes).

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  opaque type yyjson_val_uni = CArray[Byte, Nat._8]
  object yyjson_val_uni:
    given _tag: Tag[yyjson_val_uni] = Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)
    def apply()(using Zone): Ptr[yyjson_val_uni] =
      val ___ptr = alloc[yyjson_val_uni](1)
      ___ptr
    @scala.annotation.targetName("apply_u64")
    def apply(u64: uint64_t)(using Zone): Ptr[yyjson_val_uni] =
      val ___ptr = alloc[yyjson_val_uni](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[uint64_t]].update(0, u64)
      ___ptr
    @scala.annotation.targetName("apply_i64")
    def apply(i64: int64_t)(using Zone): Ptr[yyjson_val_uni] =
      val ___ptr = alloc[yyjson_val_uni](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[int64_t]].update(0, i64)
      ___ptr
    @scala.annotation.targetName("apply_f64")
    def apply(f64: Double)(using Zone): Ptr[yyjson_val_uni] =
      val ___ptr = alloc[yyjson_val_uni](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[Double]].update(0, f64)
      ___ptr
    @scala.annotation.targetName("apply_str")
    def apply(str: CString)(using Zone): Ptr[yyjson_val_uni] =
      val ___ptr = alloc[yyjson_val_uni](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[CString]].update(0, str)
      ___ptr
    @scala.annotation.targetName("apply_ptr")
    def apply(ptr: Ptr[Byte])(using Zone): Ptr[yyjson_val_uni] =
      val ___ptr = alloc[yyjson_val_uni](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[Ptr[Byte]]].update(0, ptr)
      ___ptr
    @scala.annotation.targetName("apply_ofs")
    def apply(ofs: size_t)(using Zone): Ptr[yyjson_val_uni] =
      val ___ptr = alloc[yyjson_val_uni](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[size_t]].update(0, ofs)
      ___ptr
    extension (struct: yyjson_val_uni)
      def u64 : uint64_t = !struct.at(0).asInstanceOf[Ptr[uint64_t]]
      def u64_=(value: uint64_t): Unit = !struct.at(0).asInstanceOf[Ptr[uint64_t]] = value
      def i64 : int64_t = !struct.at(0).asInstanceOf[Ptr[int64_t]]
      def i64_=(value: int64_t): Unit = !struct.at(0).asInstanceOf[Ptr[int64_t]] = value
      def f64 : Double = !struct.at(0).asInstanceOf[Ptr[Double]]
      def f64_=(value: Double): Unit = !struct.at(0).asInstanceOf[Ptr[Double]] = value
      def str : CString = !struct.at(0).asInstanceOf[Ptr[CString]]
      def str_=(value: CString): Unit = !struct.at(0).asInstanceOf[Ptr[CString]] = value
      def ptr : Ptr[Byte] = !struct.at(0).asInstanceOf[Ptr[Ptr[Byte]]]
      def ptr_=(value: Ptr[Byte]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[Byte]]] = value
      def ofs : size_t = !struct.at(0).asInstanceOf[Ptr[size_t]]
      def ofs_=(value: size_t): Unit = !struct.at(0).asInstanceOf[Ptr[size_t]] = value


@extern
private[lib_yyjson] object extern_functions:
  import _root_.lib_yyjson.aliases.*
  import _root_.lib_yyjson.structs.*
  import _root_.lib_yyjson.unions.*
  private[lib_yyjson] def __sn_wrap_lib_yyjson_yyjson_arr_iter_with(arr : Ptr[yyjson_val], __return : Ptr[yyjson_arr_iter]): Unit = extern

  private[lib_yyjson] def __sn_wrap_lib_yyjson_yyjson_mut_arr_iter_with(arr : Ptr[yyjson_mut_val], __return : Ptr[yyjson_mut_arr_iter]): Unit = extern

  private[lib_yyjson] def __sn_wrap_lib_yyjson_yyjson_mut_obj_iter_with(obj : Ptr[yyjson_mut_val], __return : Ptr[yyjson_mut_obj_iter]): Unit = extern

  private[lib_yyjson] def __sn_wrap_lib_yyjson_yyjson_obj_iter_with(obj : Ptr[yyjson_val], __return : Ptr[yyjson_obj_iter]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_arr_is_flat(`val` : Ptr[yyjson_val]): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_equals(lhs : Ptr[yyjson_val], rhs : Ptr[yyjson_val]): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_equals_str(`val` : Ptr[Byte], str : CString): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_equals_strn(`val` : Ptr[Byte], str : CString, len : size_t): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_get_bool(`val` : Ptr[Byte]): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_get_first(ctn : Ptr[yyjson_val]): Ptr[yyjson_val] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_get_int(`val` : Ptr[Byte]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_get_len(`val` : Ptr[Byte]): size_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_get_next(`val` : Ptr[yyjson_val]): Ptr[yyjson_val] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_get_num(`val` : Ptr[Byte]): Double = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_get_pointer(`val` : Ptr[yyjson_val], ptr : CString, len : size_t): Ptr[yyjson_val] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_get_raw(`val` : Ptr[Byte]): CString = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_get_real(`val` : Ptr[Byte]): Double = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_get_sint(`val` : Ptr[Byte]): int64_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_get_str(`val` : Ptr[Byte]): CString = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_get_subtype(`val` : Ptr[Byte]): yyjson_subtype = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_get_tag(`val` : Ptr[Byte]): uint8_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_get_type(`val` : Ptr[Byte]): yyjson_type = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_get_uint(`val` : Ptr[Byte]): uint64_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_inc_len(`val` : Ptr[Byte]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_is_arr(`val` : Ptr[Byte]): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_is_bool(`val` : Ptr[Byte]): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_is_ctn(`val` : Ptr[Byte]): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_is_false(`val` : Ptr[Byte]): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_is_int(`val` : Ptr[Byte]): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_is_null(`val` : Ptr[Byte]): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_is_num(`val` : Ptr[Byte]): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_is_obj(`val` : Ptr[Byte]): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_is_raw(`val` : Ptr[Byte]): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_is_real(`val` : Ptr[Byte]): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_is_sint(`val` : Ptr[Byte]): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_is_str(`val` : Ptr[Byte]): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_is_str_noesc(str : CString, len : size_t): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_is_true(`val` : Ptr[Byte]): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_is_uint(`val` : Ptr[Byte]): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_mut_equals(lhs : Ptr[yyjson_mut_val], rhs : Ptr[yyjson_mut_val]): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_mut_get_pointer(`val` : Ptr[yyjson_mut_val], ptr : CString, len : size_t): Ptr[yyjson_mut_val] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_mut_obj_add(obj : Ptr[yyjson_mut_val], key : Ptr[yyjson_mut_val], `val` : Ptr[yyjson_mut_val], len : size_t): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_mut_obj_remove(obj : Ptr[yyjson_mut_val], key : CString, key_len : size_t): Ptr[yyjson_mut_val] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_mut_obj_replace(obj : Ptr[yyjson_mut_val], key : Ptr[yyjson_mut_val], `val` : Ptr[yyjson_mut_val]): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_mut_obj_rotate(obj : Ptr[yyjson_mut_val], idx : size_t): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_mut_ptr_getx(`val` : Ptr[yyjson_mut_val], ptr : CString, len : size_t, ctx : Ptr[yyjson_ptr_ctx], err : Ptr[yyjson_ptr_err]): Ptr[yyjson_mut_val] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_mut_ptr_putx(`val` : Ptr[yyjson_mut_val], ptr : CString, len : size_t, new_val : Ptr[yyjson_mut_val], doc : Ptr[yyjson_mut_doc], create_parent : Boolean, insert_new : Boolean, ctx : Ptr[yyjson_ptr_ctx], err : Ptr[yyjson_ptr_err]): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_mut_ptr_removex(`val` : Ptr[yyjson_mut_val], ptr : CString, len : size_t, ctx : Ptr[yyjson_ptr_ctx], err : Ptr[yyjson_ptr_err]): Ptr[yyjson_mut_val] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_mut_ptr_replacex(`val` : Ptr[yyjson_mut_val], ptr : CString, len : size_t, new_val : Ptr[yyjson_mut_val], ctx : Ptr[yyjson_ptr_ctx], err : Ptr[yyjson_ptr_err]): Ptr[yyjson_mut_val] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_mut_str_alc(doc : Ptr[yyjson_mut_doc], len : size_t): CString = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_mut_strncpy(doc : Ptr[yyjson_mut_doc], str : CString, len : size_t): CString = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_mut_val(doc : Ptr[yyjson_mut_doc], count : size_t): Ptr[yyjson_mut_val] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_ptr_getx(`val` : Ptr[yyjson_val], ptr : CString, len : size_t, err : Ptr[yyjson_ptr_err]): Ptr[yyjson_val] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_set_arr(`val` : Ptr[Byte], size : size_t): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_set_bool(`val` : Ptr[Byte], num : Boolean): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_set_len(`val` : Ptr[Byte], len : size_t): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_set_null(`val` : Ptr[Byte]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_set_obj(`val` : Ptr[Byte], size : size_t): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_set_raw(`val` : Ptr[Byte], raw : CString, len : size_t): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_set_real(`val` : Ptr[Byte], num : Double): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_set_sint(`val` : Ptr[Byte], num : int64_t): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_set_str(`val` : Ptr[Byte], str : CString): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_set_strn(`val` : Ptr[Byte], str : CString, len : size_t): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_set_type(`val` : Ptr[Byte], `type` : yyjson_type, subtype : yyjson_subtype): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_set_uint(`val` : Ptr[Byte], num : uint64_t): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_str_pool_grow(pool : Ptr[yyjson_str_pool], alc : Ptr[yyjson_alc], len : size_t): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def unsafe_yyjson_val_pool_grow(pool : Ptr[yyjson_val_pool], alc : Ptr[yyjson_alc], count : size_t): Boolean = extern

  /**
   * Free a dynamic allocator which is created by `yyjson_alc_dyn_new()`.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_alc_dyn_free(alc : Ptr[yyjson_alc]): Unit = extern

  /**
   * A dynamic allocator.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_alc_dyn_new(): Ptr[yyjson_alc] = extern

  /**
   * A pool allocator uses fixed length pre-allocated memory.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_alc_pool_init(alc : Ptr[yyjson_alc], buf : Ptr[Byte], size : size_t): Boolean = extern

  /**
   * Returns the element at the specified position in this array. Returns NULL if array is NULL/empty or the index is out of bounds.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_arr_get(arr : Ptr[yyjson_val], idx : size_t): Ptr[yyjson_val] = extern

  /**
   * Returns the first element of this array. Returns NULL if `arr` is NULL/empty or type is not array.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_arr_get_first(arr : Ptr[yyjson_val]): Ptr[yyjson_val] = extern

  /**
   * Returns the last element of this array. Returns NULL if `arr` is NULL/empty or type is not array.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_arr_get_last(arr : Ptr[yyjson_val]): Ptr[yyjson_val] = extern

  /**
   * Returns whether the iteration has more elements. If `iter` is NULL, this function will return false.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_arr_iter_has_next(iter : Ptr[yyjson_arr_iter]): Boolean = extern

  /**
   * Initialize an iterator for this array.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_arr_iter_init(arr : Ptr[yyjson_val], iter : Ptr[yyjson_arr_iter]): Boolean = extern

  /**
   * Returns the next element in the iteration, or NULL on end. If `iter` is NULL, this function will return NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_arr_iter_next(iter : Ptr[yyjson_arr_iter]): Ptr[yyjson_val] = extern

  /**
   * Returns the number of elements in this array. Returns 0 if `arr` is NULL or type is not array.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_arr_size(arr : Ptr[yyjson_val]): size_t = extern

  /**
   * Release the JSON document and free the memory. After calling this function, the `doc` and all values from the `doc` are no longer available. This function will do nothing if the `doc` is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_doc_free(doc : Ptr[yyjson_doc]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_doc_get_pointer(doc : Ptr[yyjson_doc], ptr : CString): Ptr[yyjson_val] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_doc_get_pointern(doc : Ptr[yyjson_doc], ptr : CString, len : size_t): Ptr[yyjson_val] = extern

  /**
   * Returns read size of input JSON data. Returns 0 if `doc` is NULL. For example: the read size of `[1,2,3]` is 7 bytes.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_doc_get_read_size(doc : Ptr[yyjson_doc]): size_t = extern

  /**
   * Returns the root value of this JSON document. Returns NULL if `doc` is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  @name("__sn_wrap_lib_yyjson_yyjson_doc_get_root")
  def yyjson_doc_get_root(doc : Ptr[yyjson_doc]): Ptr[yyjson_val] = extern

  /**
   * Returns total value count in this JSON document. Returns 0 if `doc` is NULL. For example: the value count of `[1,2,3]` is 4.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_doc_get_val_count(doc : Ptr[yyjson_doc]): size_t = extern

  /**
   * Copies and returns a new mutable document from input, returns NULL on error. This makes a `deep-copy` on the immutable document. If allocator is NULL, the default allocator will be used.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_doc_mut_copy(doc : Ptr[yyjson_doc], alc : Ptr[yyjson_alc]): Ptr[yyjson_mut_doc] = extern

  /**
   * Get value by a JSON Pointer.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_doc_ptr_get(doc : Ptr[yyjson_doc], ptr : CString): Ptr[yyjson_val] = extern

  /**
   * Get value by a JSON Pointer.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_doc_ptr_getn(doc : Ptr[yyjson_doc], ptr : CString, len : size_t): Ptr[yyjson_val] = extern

  /**
   * Get value by a JSON Pointer.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_doc_ptr_getx(doc : Ptr[yyjson_doc], ptr : CString, len : size_t, err : Ptr[yyjson_ptr_err]): Ptr[yyjson_val] = extern

  /**
   * Returns whether two JSON values are equal (deep compare). Returns false if input is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_equals(lhs : Ptr[yyjson_val], rhs : Ptr[yyjson_val]): Boolean = extern

  /**
   * Returns whether the JSON value is equals to a string. Returns false if input is NULL or type is not string.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_equals_str(`val` : Ptr[yyjson_val], str : CString): Boolean = extern

  /**
   * Returns whether the JSON value is equals to a string. The `str` should be a UTF-8 string, null-terminator is not required. Returns false if input is NULL or type is not string.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_equals_strn(`val` : Ptr[yyjson_val], str : CString, len : size_t): Boolean = extern

  /**
   * Returns the content if the value is bool. Returns NULL if `val` is NULL or type is not bool.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_get_bool(`val` : Ptr[yyjson_val]): Boolean = extern

  /**
   * Returns the content and cast to int. Returns 0 if `val` is NULL or type is not integer(sint/uint).

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_get_int(`val` : Ptr[yyjson_val]): CInt = extern

  /**
   * Returns the content length (string length, array size, object size. Returns 0 if `val` is NULL or type is not string/array/object.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  @name("__sn_wrap_lib_yyjson_yyjson_get_len")
  def yyjson_get_len(`val` : Ptr[yyjson_val]): size_t = extern

  /**
   * Returns the content and typecast to `double` if the value is number. Returns 0.0 if `val` is NULL or type is not number(uint/sint/real).

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_get_num(`val` : Ptr[yyjson_val]): Double = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_get_pointer(`val` : Ptr[yyjson_val], ptr : CString): Ptr[yyjson_val] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_get_pointern(`val` : Ptr[yyjson_val], ptr : CString, len : size_t): Ptr[yyjson_val] = extern

  /**
   * Returns the content if the value is raw. Returns NULL if `val` is NULL or type is not raw.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_get_raw(`val` : Ptr[yyjson_val]): CString = extern

  /**
   * Returns the content if the value is real number, or 0.0 on error. Returns 0.0 if `val` is NULL or type is not real(double).

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_get_real(`val` : Ptr[yyjson_val]): Double = extern

  /**
   * Returns the content and cast to int64_t. Returns 0 if `val` is NULL or type is not integer(sint/uint).

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_get_sint(`val` : Ptr[yyjson_val]): int64_t = extern

  /**
   * Returns the content if the value is string. Returns NULL if `val` is NULL or type is not string.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  @name("__sn_wrap_lib_yyjson_yyjson_get_str")
  def yyjson_get_str(`val` : Ptr[yyjson_val]): CString = extern

  /**
   * Returns the JSON value's subtype. Returns YYJSON_SUBTYPE_NONE if `val` is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_get_subtype(`val` : Ptr[yyjson_val]): yyjson_subtype = extern

  /**
   * Returns the JSON value's tag. Returns 0 if `val` is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_get_tag(`val` : Ptr[yyjson_val]): uint8_t = extern

  /**
   * Returns the JSON value's type. Returns YYJSON_TYPE_NONE if `val` is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  @name("__sn_wrap_lib_yyjson_yyjson_get_type")
  def yyjson_get_type(`val` : Ptr[yyjson_val]): yyjson_type = extern

  /**
   * Returns the JSON value's type description. The return value should be one of these strings: "raw", "null", "string", "array", "object", "true", "false", "uint", "sint", "real", "unknown".

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_get_type_desc(`val` : Ptr[yyjson_val]): CString = extern

  /**
   * Returns the content and cast to uint64_t. Returns 0 if `val` is NULL or type is not integer(sint/uint).

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_get_uint(`val` : Ptr[yyjson_val]): uint64_t = extern

  /**
   * Returns whether the JSON value is array. Returns false if `val` is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_is_arr(`val` : Ptr[yyjson_val]): Boolean = extern

  /**
   * Returns whether the JSON value is bool (true/false). Returns false if `val` is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_is_bool(`val` : Ptr[yyjson_val]): Boolean = extern

  /**
   * Returns whether the JSON value is container (array/object). Returns false if `val` is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_is_ctn(`val` : Ptr[yyjson_val]): Boolean = extern

  /**
   * Returns whether the JSON value is `false`. Returns false if `val` is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_is_false(`val` : Ptr[yyjson_val]): Boolean = extern

  /**
   * Returns whether the JSON value is integer (uint64_t/int64_t). Returns false if `val` is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_is_int(`val` : Ptr[yyjson_val]): Boolean = extern

  /**
   * Returns whether the JSON value is `null`. Returns false if `val` is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_is_null(`val` : Ptr[yyjson_val]): Boolean = extern

  /**
   * Returns whether the JSON value is number (uint64_t/int64_t/double). Returns false if `val` is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_is_num(`val` : Ptr[yyjson_val]): Boolean = extern

  /**
   * Returns whether the JSON value is object. Returns false if `val` is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_is_obj(`val` : Ptr[yyjson_val]): Boolean = extern

  /**
   * Returns whether the JSON value is raw. Returns false if `val` is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_is_raw(`val` : Ptr[yyjson_val]): Boolean = extern

  /**
   * Returns whether the JSON value is real number (double). Returns false if `val` is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_is_real(`val` : Ptr[yyjson_val]): Boolean = extern

  /**
   * Returns whether the JSON value is signed integer (int64_t). Returns false if `val` is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_is_sint(`val` : Ptr[yyjson_val]): Boolean = extern

  /**
   * Returns whether the JSON value is string. Returns false if `val` is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_is_str(`val` : Ptr[yyjson_val]): Boolean = extern

  /**
   * Returns whether the JSON value is `true`. Returns false if `val` is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_is_true(`val` : Ptr[yyjson_val]): Boolean = extern

  /**
   * Returns whether the JSON value is unsigned integer (uint64_t). Returns false if `val` is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_is_uint(`val` : Ptr[yyjson_val]): Boolean = extern

  /**
   * Locate the line and column number for a byte position in a string. This can be used to get better description for error position.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_locate_pos(str : CString, len : size_t, pos : size_t, line : Ptr[size_t], col : Ptr[size_t], chr : Ptr[size_t]): Boolean = extern

  /**
   * Creates and returns a merge-patched JSON value (RFC 7386). The memory of the returned value is allocated by the `doc`. Returns NULL if the patch could not be applied.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_merge_patch(doc : Ptr[yyjson_mut_doc], orig : Ptr[yyjson_val], patch : Ptr[yyjson_val]): Ptr[yyjson_mut_val] = extern

  /**
   * Creates and returns an empty mutable array.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr(doc : Ptr[yyjson_mut_doc]): Ptr[yyjson_mut_val] = extern

  /**
   * Creates and adds a new array at the end of the array.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_add_arr(doc : Ptr[yyjson_mut_doc], arr : Ptr[yyjson_mut_val]): Ptr[yyjson_mut_val] = extern

  /**
   * Adds a bool value at the end of the array.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_add_bool(doc : Ptr[yyjson_mut_doc], arr : Ptr[yyjson_mut_val], _val : Boolean): Boolean = extern

  /**
   * Adds a `false` value at the end of the array.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_add_false(doc : Ptr[yyjson_mut_doc], arr : Ptr[yyjson_mut_val]): Boolean = extern

  /**
   * Adds a integer value at the end of the array.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_add_int(doc : Ptr[yyjson_mut_doc], arr : Ptr[yyjson_mut_val], num : int64_t): Boolean = extern

  /**
   * Adds a `null` value at the end of the array.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_add_null(doc : Ptr[yyjson_mut_doc], arr : Ptr[yyjson_mut_val]): Boolean = extern

  /**
   * Creates and adds a new object at the end of the array.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_add_obj(doc : Ptr[yyjson_mut_doc], arr : Ptr[yyjson_mut_val]): Ptr[yyjson_mut_val] = extern

  /**
   * Adds a double value at the end of the array.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_add_real(doc : Ptr[yyjson_mut_doc], arr : Ptr[yyjson_mut_val], num : Double): Boolean = extern

  /**
   * Adds a signed integer value at the end of the array.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_add_sint(doc : Ptr[yyjson_mut_doc], arr : Ptr[yyjson_mut_val], num : int64_t): Boolean = extern

  /**
   * Adds a string value at the end of the array (no copy).

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_add_str(doc : Ptr[yyjson_mut_doc], arr : Ptr[yyjson_mut_val], str : CString): Boolean = extern

  /**
   * Adds a string value at the end of the array (copied).

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_add_strcpy(doc : Ptr[yyjson_mut_doc], arr : Ptr[yyjson_mut_val], str : CString): Boolean = extern

  /**
   * Adds a string value at the end of the array (no copy).

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_add_strn(doc : Ptr[yyjson_mut_doc], arr : Ptr[yyjson_mut_val], str : CString, len : size_t): Boolean = extern

  /**
   * Adds a string value at the end of the array (copied).

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_add_strncpy(doc : Ptr[yyjson_mut_doc], arr : Ptr[yyjson_mut_val], str : CString, len : size_t): Boolean = extern

  /**
   * Adds a `true` value at the end of the array.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_add_true(doc : Ptr[yyjson_mut_doc], arr : Ptr[yyjson_mut_val]): Boolean = extern

  /**
   * Adds an unsigned integer value at the end of the array.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_add_uint(doc : Ptr[yyjson_mut_doc], arr : Ptr[yyjson_mut_val], num : uint64_t): Boolean = extern

  /**
   * Adds a value at the end of the array.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_add_val(arr : Ptr[yyjson_mut_val], `val` : Ptr[yyjson_mut_val]): Boolean = extern

  /**
   * Inserts a value at the end of the array.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_append(arr : Ptr[yyjson_mut_val], `val` : Ptr[yyjson_mut_val]): Boolean = extern

  /**
   * Removes all values in this array.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_clear(arr : Ptr[yyjson_mut_val]): Boolean = extern

  /**
   * Returns the element at the specified position in this array. Returns NULL if array is NULL/empty or the index is out of bounds.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_get(arr : Ptr[yyjson_mut_val], idx : size_t): Ptr[yyjson_mut_val] = extern

  /**
   * Returns the first element of this array. Returns NULL if `arr` is NULL/empty or type is not array.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_get_first(arr : Ptr[yyjson_mut_val]): Ptr[yyjson_mut_val] = extern

  /**
   * Returns the last element of this array. Returns NULL if `arr` is NULL/empty or type is not array.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_get_last(arr : Ptr[yyjson_mut_val]): Ptr[yyjson_mut_val] = extern

  /**
   * Inserts a value into an array at a given index.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_insert(arr : Ptr[yyjson_mut_val], `val` : Ptr[yyjson_mut_val], idx : size_t): Boolean = extern

  /**
   * Returns whether the iteration has more elements. If `iter` is NULL, this function will return false.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_iter_has_next(iter : Ptr[yyjson_mut_arr_iter]): Boolean = extern

  /**
   * Initialize an iterator for this array.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_iter_init(arr : Ptr[yyjson_mut_val], iter : Ptr[yyjson_mut_arr_iter]): Boolean = extern

  /**
   * Returns the next element in the iteration, or NULL on end. If `iter` is NULL, this function will return NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_iter_next(iter : Ptr[yyjson_mut_arr_iter]): Ptr[yyjson_mut_val] = extern

  /**
   * Removes and returns current element in the iteration. If `iter` is NULL, this function will return NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_iter_remove(iter : Ptr[yyjson_mut_arr_iter]): Ptr[yyjson_mut_val] = extern

  /**
   * Inserts a value at the head of the array.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_prepend(arr : Ptr[yyjson_mut_val], `val` : Ptr[yyjson_mut_val]): Boolean = extern

  /**
   * Removes and returns a value at index.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_remove(arr : Ptr[yyjson_mut_val], idx : size_t): Ptr[yyjson_mut_val] = extern

  /**
   * Removes and returns the first value in this array.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_remove_first(arr : Ptr[yyjson_mut_val]): Ptr[yyjson_mut_val] = extern

  /**
   * Removes and returns the last value in this array.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_remove_last(arr : Ptr[yyjson_mut_val]): Ptr[yyjson_mut_val] = extern

  /**
   * Removes all values within a specified range in the array.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_remove_range(arr : Ptr[yyjson_mut_val], _idx : size_t, _len : size_t): Boolean = extern

  /**
   * Replaces a value at index and returns old value.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_replace(arr : Ptr[yyjson_mut_val], idx : size_t, `val` : Ptr[yyjson_mut_val]): Ptr[yyjson_mut_val] = extern

  /**
   * Rotates values in this array for the given number of times. For example: `[1,2,3,4,5]` rotate 2 is `[3,4,5,1,2]`.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_rotate(arr : Ptr[yyjson_mut_val], idx : size_t): Boolean = extern

  /**
   * Returns the number of elements in this array. Returns 0 if `arr` is NULL or type is not array.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_size(arr : Ptr[yyjson_mut_val]): size_t = extern

  /**
   * Creates and returns a new mutable array with the given boolean values.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_with_bool(doc : Ptr[yyjson_mut_doc], vals : Ptr[Boolean], count : size_t): Ptr[yyjson_mut_val] = extern

  /**
   * Creates and returns a new mutable array with the given double numbers.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_with_double(doc : Ptr[yyjson_mut_doc], vals : Ptr[Double], count : size_t): Ptr[yyjson_mut_val] = extern

  /**
   * Creates and returns a new mutable array with the given float numbers.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_with_float(doc : Ptr[yyjson_mut_doc], vals : Ptr[Float], count : size_t): Ptr[yyjson_mut_val] = extern

  /**
   * Creates and returns a new mutable array with the given real numbers.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_with_real(doc : Ptr[yyjson_mut_doc], vals : Ptr[Double], count : size_t): Ptr[yyjson_mut_val] = extern

  /**
   * Creates and returns a new mutable array with the given sint numbers.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_with_sint(doc : Ptr[yyjson_mut_doc], vals : Ptr[int64_t], count : size_t): Ptr[yyjson_mut_val] = extern

  /**
   * Creates and returns a new mutable array with the given int16 numbers.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_with_sint16(doc : Ptr[yyjson_mut_doc], vals : Ptr[int16_t], count : size_t): Ptr[yyjson_mut_val] = extern

  /**
   * Creates and returns a new mutable array with the given int32 numbers.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_with_sint32(doc : Ptr[yyjson_mut_doc], vals : Ptr[int32_t], count : size_t): Ptr[yyjson_mut_val] = extern

  /**
   * Creates and returns a new mutable array with the given int64 numbers.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_with_sint64(doc : Ptr[yyjson_mut_doc], vals : Ptr[int64_t], count : size_t): Ptr[yyjson_mut_val] = extern

  /**
   * Creates and returns a new mutable array with the given int8 numbers.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_with_sint8(doc : Ptr[yyjson_mut_doc], vals : Ptr[int8_t], count : size_t): Ptr[yyjson_mut_val] = extern

  /**
   * Creates and returns a new mutable array with the given strings, these strings will not be copied.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_with_str(doc : Ptr[yyjson_mut_doc], vals : Ptr[CString], count : size_t): Ptr[yyjson_mut_val] = extern

  /**
   * Creates and returns a new mutable array with the given strings, these strings will be copied.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_with_strcpy(doc : Ptr[yyjson_mut_doc], vals : Ptr[CString], count : size_t): Ptr[yyjson_mut_val] = extern

  /**
   * Creates and returns a new mutable array with the given strings and string lengths, these strings will not be copied.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_with_strn(doc : Ptr[yyjson_mut_doc], vals : Ptr[CString], lens : Ptr[size_t], count : size_t): Ptr[yyjson_mut_val] = extern

  /**
   * Creates and returns a new mutable array with the given strings and string lengths, these strings will be copied.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_with_strncpy(doc : Ptr[yyjson_mut_doc], vals : Ptr[CString], lens : Ptr[size_t], count : size_t): Ptr[yyjson_mut_val] = extern

  /**
   * Creates and returns a new mutable array with the given uint numbers.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_with_uint(doc : Ptr[yyjson_mut_doc], vals : Ptr[uint64_t], count : size_t): Ptr[yyjson_mut_val] = extern

  /**
   * Creates and returns a new mutable array with the given uint16 numbers.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_with_uint16(doc : Ptr[yyjson_mut_doc], vals : Ptr[uint16_t], count : size_t): Ptr[yyjson_mut_val] = extern

  /**
   * Creates and returns a new mutable array with the given uint32 numbers.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_with_uint32(doc : Ptr[yyjson_mut_doc], vals : Ptr[uint32_t], count : size_t): Ptr[yyjson_mut_val] = extern

  /**
   * Creates and returns a new mutable array with the given uint64 numbers.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_with_uint64(doc : Ptr[yyjson_mut_doc], vals : Ptr[uint64_t], count : size_t): Ptr[yyjson_mut_val] = extern

  /**
   * Creates and returns a new mutable array with the given uint8 numbers.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_with_uint8(doc : Ptr[yyjson_mut_doc], vals : Ptr[uint8_t], count : size_t): Ptr[yyjson_mut_val] = extern

  /**
   * Creates and returns a bool value, returns NULL on error.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_bool(doc : Ptr[yyjson_mut_doc], _val : Boolean): Ptr[yyjson_mut_val] = extern

  /**
   * Release the JSON document and free the memory. After calling this function, the `doc` and all values from the `doc` are no longer available. This function will do nothing if the `doc` is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_doc_free(doc : Ptr[yyjson_mut_doc]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_doc_get_pointer(doc : Ptr[yyjson_mut_doc], ptr : CString): Ptr[yyjson_mut_val] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_doc_get_pointern(doc : Ptr[yyjson_mut_doc], ptr : CString, len : size_t): Ptr[yyjson_mut_val] = extern

  /**
   * Returns the root value of this JSON document. Returns NULL if `doc` is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_doc_get_root(doc : Ptr[yyjson_mut_doc]): Ptr[yyjson_mut_val] = extern

  /**
   * Copies and returns a new immutable document from input, returns NULL on error. This makes a `deep-copy` on the mutable document. The returned document should be freed with `yyjson_doc_free()`.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_doc_imut_copy(doc : Ptr[yyjson_mut_doc], alc : Ptr[yyjson_alc]): Ptr[yyjson_doc] = extern

  /**
   * Copies and returns a new mutable document from input, returns NULL on error. This makes a `deep-copy` on the mutable document. If allocator is NULL, the default allocator will be used.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_doc_mut_copy(doc : Ptr[yyjson_mut_doc], alc : Ptr[yyjson_alc]): Ptr[yyjson_mut_doc] = extern

  /**
   * Creates and returns a new mutable JSON document, returns NULL on error. If allocator is NULL, the default allocator will be used.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_doc_new(alc : Ptr[yyjson_alc]): Ptr[yyjson_mut_doc] = extern

  /**
   * Add (insert) value by a JSON pointer.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_doc_ptr_add(doc : Ptr[yyjson_mut_doc], ptr : CString, new_val : Ptr[yyjson_mut_val]): Boolean = extern

  /**
   * Add (insert) value by a JSON pointer.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_doc_ptr_addn(doc : Ptr[yyjson_mut_doc], ptr : CString, len : size_t, new_val : Ptr[yyjson_mut_val]): Boolean = extern

  /**
   * Add (insert) value by a JSON pointer.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_doc_ptr_addx(doc : Ptr[yyjson_mut_doc], ptr : CString, len : size_t, new_val : Ptr[yyjson_mut_val], create_parent : Boolean, ctx : Ptr[yyjson_ptr_ctx], err : Ptr[yyjson_ptr_err]): Boolean = extern

  /**
   * Get value by a JSON Pointer.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_doc_ptr_get(doc : Ptr[yyjson_mut_doc], ptr : CString): Ptr[yyjson_mut_val] = extern

  /**
   * Get value by a JSON Pointer.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_doc_ptr_getn(doc : Ptr[yyjson_mut_doc], ptr : CString, len : size_t): Ptr[yyjson_mut_val] = extern

  /**
   * Get value by a JSON Pointer.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_doc_ptr_getx(doc : Ptr[yyjson_mut_doc], ptr : CString, len : size_t, ctx : Ptr[yyjson_ptr_ctx], err : Ptr[yyjson_ptr_err]): Ptr[yyjson_mut_val] = extern

  /**
   * Remove value by a JSON pointer.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_doc_ptr_remove(doc : Ptr[yyjson_mut_doc], ptr : CString): Ptr[yyjson_mut_val] = extern

  /**
   * Remove value by a JSON pointer.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_doc_ptr_removen(doc : Ptr[yyjson_mut_doc], ptr : CString, len : size_t): Ptr[yyjson_mut_val] = extern

  /**
   * Remove value by a JSON pointer.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_doc_ptr_removex(doc : Ptr[yyjson_mut_doc], ptr : CString, len : size_t, ctx : Ptr[yyjson_ptr_ctx], err : Ptr[yyjson_ptr_err]): Ptr[yyjson_mut_val] = extern

  /**
   * Replace value by a JSON pointer.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_doc_ptr_replace(doc : Ptr[yyjson_mut_doc], ptr : CString, new_val : Ptr[yyjson_mut_val]): Ptr[yyjson_mut_val] = extern

  /**
   * Replace value by a JSON pointer.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_doc_ptr_replacen(doc : Ptr[yyjson_mut_doc], ptr : CString, len : size_t, new_val : Ptr[yyjson_mut_val]): Ptr[yyjson_mut_val] = extern

  /**
   * Replace value by a JSON pointer.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_doc_ptr_replacex(doc : Ptr[yyjson_mut_doc], ptr : CString, len : size_t, new_val : Ptr[yyjson_mut_val], ctx : Ptr[yyjson_ptr_ctx], err : Ptr[yyjson_ptr_err]): Ptr[yyjson_mut_val] = extern

  /**
   * Set value by a JSON pointer.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_doc_ptr_set(doc : Ptr[yyjson_mut_doc], ptr : CString, new_val : Ptr[yyjson_mut_val]): Boolean = extern

  /**
   * Set value by a JSON pointer.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_doc_ptr_setn(doc : Ptr[yyjson_mut_doc], ptr : CString, len : size_t, new_val : Ptr[yyjson_mut_val]): Boolean = extern

  /**
   * Set value by a JSON pointer.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_doc_ptr_setx(doc : Ptr[yyjson_mut_doc], ptr : CString, len : size_t, new_val : Ptr[yyjson_mut_val], create_parent : Boolean, ctx : Ptr[yyjson_ptr_ctx], err : Ptr[yyjson_ptr_err]): Boolean = extern

  /**
   * Sets the root value of this JSON document. Pass NULL to clear root value of the document.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_doc_set_root(doc : Ptr[yyjson_mut_doc], root : Ptr[yyjson_mut_val]): Unit = extern

  /**
   * Set the string pool size for a mutable document. This function does not allocate memory immediately, but uses the size when the next memory allocation is needed.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_doc_set_str_pool_size(doc : Ptr[yyjson_mut_doc], len : size_t): Boolean = extern

  /**
   * Set the value pool size for a mutable document. This function does not allocate memory immediately, but uses the size when the next memory allocation is needed.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_doc_set_val_pool_size(doc : Ptr[yyjson_mut_doc], count : size_t): Boolean = extern

  /**
   * Returns whether two JSON values are equal (deep compare). Returns false if input is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_equals(lhs : Ptr[yyjson_mut_val], rhs : Ptr[yyjson_mut_val]): Boolean = extern

  /**
   * Returns whether the JSON value is equals to a string. The `str` should be a null-terminated UTF-8 string. Returns false if input is NULL or type is not string.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_equals_str(`val` : Ptr[yyjson_mut_val], str : CString): Boolean = extern

  /**
   * Returns whether the JSON value is equals to a string. The `str` should be a UTF-8 string, null-terminator is not required. Returns false if input is NULL or type is not string.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_equals_strn(`val` : Ptr[yyjson_mut_val], str : CString, len : size_t): Boolean = extern

  /**
   * Creates and returns a false value, returns NULL on error.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_false(doc : Ptr[yyjson_mut_doc]): Ptr[yyjson_mut_val] = extern

  /**
   * Returns the content if the value is bool. Returns NULL if `val` is NULL or type is not bool.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_get_bool(`val` : Ptr[yyjson_mut_val]): Boolean = extern

  /**
   * Returns the content and cast to int. Returns 0 if `val` is NULL or type is not integer(sint/uint).

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_get_int(`val` : Ptr[yyjson_mut_val]): CInt = extern

  /**
   * Returns the content length (string length, array size, object size. Returns 0 if `val` is NULL or type is not string/array/object.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_get_len(`val` : Ptr[yyjson_mut_val]): size_t = extern

  /**
   * Returns the content and typecast to `double` if the value is number. Returns 0.0 if `val` is NULL or type is not number(uint/sint/real).

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_get_num(`val` : Ptr[yyjson_mut_val]): Double = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_get_pointer(`val` : Ptr[yyjson_mut_val], ptr : CString): Ptr[yyjson_mut_val] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_get_pointern(`val` : Ptr[yyjson_mut_val], ptr : CString, len : size_t): Ptr[yyjson_mut_val] = extern

  /**
   * Returns the content if the value is raw. Returns NULL if `val` is NULL or type is not raw.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_get_raw(`val` : Ptr[yyjson_mut_val]): CString = extern

  /**
   * Returns the content if the value is real number. Returns 0.0 if `val` is NULL or type is not real(double).

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_get_real(`val` : Ptr[yyjson_mut_val]): Double = extern

  /**
   * Returns the content and cast to int64_t. Returns 0 if `val` is NULL or type is not integer(sint/uint).

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_get_sint(`val` : Ptr[yyjson_mut_val]): int64_t = extern

  /**
   * Returns the content if the value is string. Returns NULL if `val` is NULL or type is not string.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_get_str(`val` : Ptr[yyjson_mut_val]): CString = extern

  /**
   * Returns the JSON value's subtype. Returns `YYJSON_SUBTYPE_NONE` if `val` is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_get_subtype(`val` : Ptr[yyjson_mut_val]): yyjson_subtype = extern

  /**
   * Returns the JSON value's tag. Returns 0 if `val` is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_get_tag(`val` : Ptr[yyjson_mut_val]): uint8_t = extern

  /**
   * Returns the JSON value's type. Returns `YYJSON_TYPE_NONE` if `val` is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_get_type(`val` : Ptr[yyjson_mut_val]): yyjson_type = extern

  /**
   * Returns the JSON value's type description. The return value should be one of these strings: "raw", "null", "string", "array", "object", "true", "false", "uint", "sint", "real", "unknown".

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_get_type_desc(`val` : Ptr[yyjson_mut_val]): CString = extern

  /**
   * Returns the content and cast to uint64_t. Returns 0 if `val` is NULL or type is not integer(sint/uint).

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_get_uint(`val` : Ptr[yyjson_mut_val]): uint64_t = extern

  /**
   * Creates and returns a signed integer value, returns NULL on error.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_int(doc : Ptr[yyjson_mut_doc], num : int64_t): Ptr[yyjson_mut_val] = extern

  /**
   * Returns whether the JSON value is array. Returns false if `val` is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_is_arr(`val` : Ptr[yyjson_mut_val]): Boolean = extern

  /**
   * Returns whether the JSON value is bool (true/false). Returns false if `val` is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_is_bool(`val` : Ptr[yyjson_mut_val]): Boolean = extern

  /**
   * Returns whether the JSON value is container (array/object). Returns false if `val` is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_is_ctn(`val` : Ptr[yyjson_mut_val]): Boolean = extern

  /**
   * Returns whether the JSON value is `false`. Returns false if `val` is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_is_false(`val` : Ptr[yyjson_mut_val]): Boolean = extern

  /**
   * Returns whether the JSON value is integer (uint64_t/int64_t). Returns false if `val` is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_is_int(`val` : Ptr[yyjson_mut_val]): Boolean = extern

  /**
   * Returns whether the JSON value is `null`. Returns false if `val` is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_is_null(`val` : Ptr[yyjson_mut_val]): Boolean = extern

  /**
   * Returns whether the JSON value is number (uint/sint/real). Returns false if `val` is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_is_num(`val` : Ptr[yyjson_mut_val]): Boolean = extern

  /**
   * Returns whether the JSON value is object. Returns false if `val` is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_is_obj(`val` : Ptr[yyjson_mut_val]): Boolean = extern

  /**
   * Returns whether the JSON value is raw. Returns false if `val` is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_is_raw(`val` : Ptr[yyjson_mut_val]): Boolean = extern

  /**
   * Returns whether the JSON value is real number (double). Returns false if `val` is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_is_real(`val` : Ptr[yyjson_mut_val]): Boolean = extern

  /**
   * Returns whether the JSON value is signed integer (int64_t). Returns false if `val` is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_is_sint(`val` : Ptr[yyjson_mut_val]): Boolean = extern

  /**
   * Returns whether the JSON value is string. Returns false if `val` is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_is_str(`val` : Ptr[yyjson_mut_val]): Boolean = extern

  /**
   * Returns whether the JSON value is `true`. Returns false if `val` is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_is_true(`val` : Ptr[yyjson_mut_val]): Boolean = extern

  /**
   * Returns whether the JSON value is unsigned integer (uint64_t). Returns false if `val` is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_is_uint(`val` : Ptr[yyjson_mut_val]): Boolean = extern

  /**
   * Creates and returns a merge-patched JSON value (RFC 7386). The memory of the returned value is allocated by the `doc`. Returns NULL if the patch could not be applied.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_merge_patch(doc : Ptr[yyjson_mut_doc], orig : Ptr[yyjson_mut_val], patch : Ptr[yyjson_mut_val]): Ptr[yyjson_mut_val] = extern

  /**
   * Creates and returns a null value, returns NULL on error.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_null(doc : Ptr[yyjson_mut_doc]): Ptr[yyjson_mut_val] = extern

  /**
   * Creates and returns a mutable object, returns NULL on error.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_obj(doc : Ptr[yyjson_mut_doc]): Ptr[yyjson_mut_val] = extern

  /**
   * Adds a key-value pair at the end of the object. This function allows duplicated key in one object.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_obj_add(obj : Ptr[yyjson_mut_val], key : Ptr[yyjson_mut_val], `val` : Ptr[yyjson_mut_val]): Boolean = extern

  /**
   * Creates and adds a new array to the target object. The `key` should be a null-terminated UTF-8 string. This function allows duplicated key in one object.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_obj_add_arr(doc : Ptr[yyjson_mut_doc], obj : Ptr[yyjson_mut_val], _key : CString): Ptr[yyjson_mut_val] = extern

  /**
   * Adds a bool value at the end of the object. The `key` should be a null-terminated UTF-8 string. This function allows duplicated key in one object.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_obj_add_bool(doc : Ptr[yyjson_mut_doc], obj : Ptr[yyjson_mut_val], _key : CString, _val : Boolean): Boolean = extern

  /**
   * Adds a `false` value at the end of the object. The `key` should be a null-terminated UTF-8 string. This function allows duplicated key in one object.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_obj_add_false(doc : Ptr[yyjson_mut_doc], obj : Ptr[yyjson_mut_val], _key : CString): Boolean = extern

  /**
   * Adds an int value at the end of the object. The `key` should be a null-terminated UTF-8 string. This function allows duplicated key in one object.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_obj_add_int(doc : Ptr[yyjson_mut_doc], obj : Ptr[yyjson_mut_val], _key : CString, _val : int64_t): Boolean = extern

  /**
   * Adds a `null` value at the end of the object. The `key` should be a null-terminated UTF-8 string. This function allows duplicated key in one object.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_obj_add_null(doc : Ptr[yyjson_mut_doc], obj : Ptr[yyjson_mut_val], _key : CString): Boolean = extern

  /**
   * Creates and adds a new object to the target object. The `key` should be a null-terminated UTF-8 string. This function allows duplicated key in one object.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_obj_add_obj(doc : Ptr[yyjson_mut_doc], obj : Ptr[yyjson_mut_val], _key : CString): Ptr[yyjson_mut_val] = extern

  /**
   * Adds a double value at the end of the object. The `key` should be a null-terminated UTF-8 string. This function allows duplicated key in one object.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_obj_add_real(doc : Ptr[yyjson_mut_doc], obj : Ptr[yyjson_mut_val], _key : CString, _val : Double): Boolean = extern

  /**
   * Adds a signed integer value at the end of the object. The `key` should be a null-terminated UTF-8 string. This function allows duplicated key in one object.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_obj_add_sint(doc : Ptr[yyjson_mut_doc], obj : Ptr[yyjson_mut_val], _key : CString, _val : int64_t): Boolean = extern

  /**
   * Adds a string value at the end of the object. The `key` and `val` should be null-terminated UTF-8 strings. This function allows duplicated key in one object.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_obj_add_str(doc : Ptr[yyjson_mut_doc], obj : Ptr[yyjson_mut_val], _key : CString, _val : CString): Boolean = extern

  /**
   * Adds a string value at the end of the object. The `key` and `val` should be null-terminated UTF-8 strings. The value string is copied. This function allows duplicated key in one object.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_obj_add_strcpy(doc : Ptr[yyjson_mut_doc], obj : Ptr[yyjson_mut_val], _key : CString, _val : CString): Boolean = extern

  /**
   * Adds a string value at the end of the object. The `key` should be a null-terminated UTF-8 string. The `val` should be a UTF-8 string, null-terminator is not required. The `len` should be the length of the `val`, in bytes. This function allows duplicated key in one object.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_obj_add_strn(doc : Ptr[yyjson_mut_doc], obj : Ptr[yyjson_mut_val], _key : CString, _val : CString, _len : size_t): Boolean = extern

  /**
   * Adds a string value at the end of the object. The `key` should be a null-terminated UTF-8 string. The `val` should be a UTF-8 string, null-terminator is not required. The `len` should be the length of the `val`, in bytes. This function allows duplicated key in one object.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_obj_add_strncpy(doc : Ptr[yyjson_mut_doc], obj : Ptr[yyjson_mut_val], _key : CString, _val : CString, _len : size_t): Boolean = extern

  /**
   * Adds a `true` value at the end of the object. The `key` should be a null-terminated UTF-8 string. This function allows duplicated key in one object.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_obj_add_true(doc : Ptr[yyjson_mut_doc], obj : Ptr[yyjson_mut_val], _key : CString): Boolean = extern

  /**
   * Adds an unsigned integer value at the end of the object. The `key` should be a null-terminated UTF-8 string. This function allows duplicated key in one object.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_obj_add_uint(doc : Ptr[yyjson_mut_doc], obj : Ptr[yyjson_mut_val], _key : CString, _val : uint64_t): Boolean = extern

  /**
   * Adds a JSON value at the end of the object. The `key` should be a null-terminated UTF-8 string. This function allows duplicated key in one object.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_obj_add_val(doc : Ptr[yyjson_mut_doc], obj : Ptr[yyjson_mut_val], _key : CString, _val : Ptr[yyjson_mut_val]): Boolean = extern

  /**
   * Removes all key-value pairs in this object.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_obj_clear(obj : Ptr[yyjson_mut_val]): Boolean = extern

  /**
   * Returns the value to which the specified key is mapped. Returns NULL if this object contains no mapping for the key. Returns NULL if `obj/key` is NULL, or type is not object.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_obj_get(obj : Ptr[yyjson_mut_val], key : CString): Ptr[yyjson_mut_val] = extern

  /**
   * Returns the value to which the specified key is mapped. Returns NULL if this object contains no mapping for the key. Returns NULL if `obj/key` is NULL, or type is not object.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_obj_getn(obj : Ptr[yyjson_mut_val], _key : CString, key_len : size_t): Ptr[yyjson_mut_val] = extern

  /**
   * Inserts a key-value pair to the object at the given position. This function allows duplicated key in one object.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_obj_insert(obj : Ptr[yyjson_mut_val], key : Ptr[yyjson_mut_val], `val` : Ptr[yyjson_mut_val], idx : size_t): Boolean = extern

  /**
   * Iterates to a specified key and returns the value.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_obj_iter_get(iter : Ptr[yyjson_mut_obj_iter], key : CString): Ptr[yyjson_mut_val] = extern

  /**
   * Returns the value for key inside the iteration. If `iter` is NULL, this function will return NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_obj_iter_get_val(key : Ptr[yyjson_mut_val]): Ptr[yyjson_mut_val] = extern

  /**
   * Iterates to a specified key and returns the value.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_obj_iter_getn(iter : Ptr[yyjson_mut_obj_iter], key : CString, key_len : size_t): Ptr[yyjson_mut_val] = extern

  /**
   * Returns whether the iteration has more elements. If `iter` is NULL, this function will return false.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_obj_iter_has_next(iter : Ptr[yyjson_mut_obj_iter]): Boolean = extern

  /**
   * Initialize an iterator for this object.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_obj_iter_init(obj : Ptr[yyjson_mut_val], iter : Ptr[yyjson_mut_obj_iter]): Boolean = extern

  /**
   * Returns the next key in the iteration, or NULL on end. If `iter` is NULL, this function will return NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_obj_iter_next(iter : Ptr[yyjson_mut_obj_iter]): Ptr[yyjson_mut_val] = extern

  /**
   * Removes current key-value pair in the iteration, returns the removed value. If `iter` is NULL, this function will return NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_obj_iter_remove(iter : Ptr[yyjson_mut_obj_iter]): Ptr[yyjson_mut_val] = extern

  /**
   * Sets a key-value pair at the end of the object. This function may remove all key-value pairs for the given key before add.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_obj_put(obj : Ptr[yyjson_mut_val], key : Ptr[yyjson_mut_val], `val` : Ptr[yyjson_mut_val]): Boolean = extern

  /**
   * Removes all key-value pair from the object with given key.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_obj_remove(obj : Ptr[yyjson_mut_val], key : Ptr[yyjson_mut_val]): Ptr[yyjson_mut_val] = extern

  /**
   * Removes all key-value pair from the object with given key.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_obj_remove_key(obj : Ptr[yyjson_mut_val], key : CString): Ptr[yyjson_mut_val] = extern

  /**
   * Removes all key-value pair from the object with given key.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_obj_remove_keyn(obj : Ptr[yyjson_mut_val], key : CString, key_len : size_t): Ptr[yyjson_mut_val] = extern

  /**
   * Removes all key-value pairs for the given key. Returns the first value to which the specified key is mapped or NULL if this object contains no mapping for the key. The `key` should be a null-terminated UTF-8 string.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_obj_remove_str(obj : Ptr[yyjson_mut_val], key : CString): Ptr[yyjson_mut_val] = extern

  /**
   * Removes all key-value pairs for the given key. Returns the first value to which the specified key is mapped or NULL if this object contains no mapping for the key. The `key` should be a UTF-8 string, null-terminator is not required. The `len` should be the length of the key, in bytes.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_obj_remove_strn(obj : Ptr[yyjson_mut_val], _key : CString, _len : size_t): Ptr[yyjson_mut_val] = extern

  /**
   * Replaces all matching keys with the new key. Returns true if at least one key was renamed. The `key` and `new_key` should be a null-terminated UTF-8 string. The `new_key` is copied and held by doc.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_obj_rename_key(doc : Ptr[yyjson_mut_doc], obj : Ptr[yyjson_mut_val], key : CString, new_key : CString): Boolean = extern

  /**
   * Replaces all matching keys with the new key. Returns true if at least one key was renamed. The `key` and `new_key` should be a UTF-8 string, null-terminator is not required. The `new_key` is copied and held by doc.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_obj_rename_keyn(doc : Ptr[yyjson_mut_doc], obj : Ptr[yyjson_mut_val], key : CString, len : size_t, new_key : CString, new_len : size_t): Boolean = extern

  /**
   * Replaces value from the object with given key. If the key is not exist, or the value is NULL, it will fail.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_obj_replace(obj : Ptr[yyjson_mut_val], key : Ptr[yyjson_mut_val], `val` : Ptr[yyjson_mut_val]): Boolean = extern

  /**
   * Rotates key-value pairs in the object for the given number of times. For example: `{"a":1,"b":2,"c":3,"d":4}` rotate 1 is `{"b":2,"c":3,"d":4,"a":1}`.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_obj_rotate(obj : Ptr[yyjson_mut_val], idx : size_t): Boolean = extern

  /**
   * Returns the number of key-value pairs in this object. Returns 0 if `obj` is NULL or type is not object.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_obj_size(obj : Ptr[yyjson_mut_val]): size_t = extern

  /**
   * Creates and returns a mutable object with key-value pairs and pair count, returns NULL on error. The keys and values are not copied. The strings should be a null-terminated UTF-8 string.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_obj_with_kv(doc : Ptr[yyjson_mut_doc], pairs : Ptr[CString], count : size_t): Ptr[yyjson_mut_val] = extern

  /**
   * Creates and returns a mutable object with keys and values, returns NULL on error. The keys and values are not copied. The strings should be a null-terminated UTF-8 string.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_obj_with_str(doc : Ptr[yyjson_mut_doc], keys : Ptr[CString], vals : Ptr[CString], count : size_t): Ptr[yyjson_mut_val] = extern

  /**
   * Creates and returns a patched JSON value (RFC 6902). The memory of the returned value is allocated by the `doc`. The `err` is used to receive error information, pass NULL if not needed. Returns NULL if the patch could not be applied.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_patch(doc : Ptr[yyjson_mut_doc], orig : Ptr[yyjson_mut_val], patch : Ptr[yyjson_mut_val], err : Ptr[yyjson_patch_err]): Ptr[yyjson_mut_val] = extern

  /**
   * Add (insert) value by a JSON pointer.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_ptr_add(`val` : Ptr[yyjson_mut_val], ptr : CString, new_val : Ptr[yyjson_mut_val], doc : Ptr[yyjson_mut_doc]): Boolean = extern

  /**
   * Add (insert) value by a JSON pointer.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_ptr_addn(`val` : Ptr[yyjson_mut_val], ptr : CString, len : size_t, new_val : Ptr[yyjson_mut_val], doc : Ptr[yyjson_mut_doc]): Boolean = extern

  /**
   * Add (insert) value by a JSON pointer.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_ptr_addx(`val` : Ptr[yyjson_mut_val], ptr : CString, len : size_t, new_val : Ptr[yyjson_mut_val], doc : Ptr[yyjson_mut_doc], create_parent : Boolean, ctx : Ptr[yyjson_ptr_ctx], err : Ptr[yyjson_ptr_err]): Boolean = extern

  /**
   * Get value by a JSON Pointer.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_ptr_get(`val` : Ptr[yyjson_mut_val], ptr : CString): Ptr[yyjson_mut_val] = extern

  /**
   * Get value by a JSON Pointer.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_ptr_getn(`val` : Ptr[yyjson_mut_val], ptr : CString, len : size_t): Ptr[yyjson_mut_val] = extern

  /**
   * Get value by a JSON Pointer.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_ptr_getx(`val` : Ptr[yyjson_mut_val], ptr : CString, len : size_t, ctx : Ptr[yyjson_ptr_ctx], err : Ptr[yyjson_ptr_err]): Ptr[yyjson_mut_val] = extern

  /**
   * Remove value by a JSON pointer.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_ptr_remove(`val` : Ptr[yyjson_mut_val], ptr : CString): Ptr[yyjson_mut_val] = extern

  /**
   * Remove value by a JSON pointer.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_ptr_removen(`val` : Ptr[yyjson_mut_val], ptr : CString, len : size_t): Ptr[yyjson_mut_val] = extern

  /**
   * Remove value by a JSON pointer.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_ptr_removex(`val` : Ptr[yyjson_mut_val], ptr : CString, len : size_t, ctx : Ptr[yyjson_ptr_ctx], err : Ptr[yyjson_ptr_err]): Ptr[yyjson_mut_val] = extern

  /**
   * Replace value by a JSON pointer.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_ptr_replace(`val` : Ptr[yyjson_mut_val], ptr : CString, new_val : Ptr[yyjson_mut_val]): Ptr[yyjson_mut_val] = extern

  /**
   * Replace value by a JSON pointer.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_ptr_replacen(`val` : Ptr[yyjson_mut_val], ptr : CString, len : size_t, new_val : Ptr[yyjson_mut_val]): Ptr[yyjson_mut_val] = extern

  /**
   * Replace value by a JSON pointer.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_ptr_replacex(`val` : Ptr[yyjson_mut_val], ptr : CString, len : size_t, new_val : Ptr[yyjson_mut_val], ctx : Ptr[yyjson_ptr_ctx], err : Ptr[yyjson_ptr_err]): Ptr[yyjson_mut_val] = extern

  /**
   * Set value by a JSON pointer.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_ptr_set(`val` : Ptr[yyjson_mut_val], ptr : CString, new_val : Ptr[yyjson_mut_val], doc : Ptr[yyjson_mut_doc]): Boolean = extern

  /**
   * Set value by a JSON pointer.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_ptr_setn(`val` : Ptr[yyjson_mut_val], ptr : CString, len : size_t, new_val : Ptr[yyjson_mut_val], doc : Ptr[yyjson_mut_doc]): Boolean = extern

  /**
   * Set value by a JSON pointer.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_ptr_setx(`val` : Ptr[yyjson_mut_val], ptr : CString, len : size_t, new_val : Ptr[yyjson_mut_val], doc : Ptr[yyjson_mut_doc], create_parent : Boolean, ctx : Ptr[yyjson_ptr_ctx], err : Ptr[yyjson_ptr_err]): Boolean = extern

  /**
   * Creates and returns a raw value, returns NULL on error. The `str` should be a null-terminated UTF-8 string.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_raw(doc : Ptr[yyjson_mut_doc], str : CString): Ptr[yyjson_mut_val] = extern

  /**
   * Creates and returns a raw value, returns NULL on error. The `str` should be a null-terminated UTF-8 string. The input string is copied and held by the document.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_rawcpy(doc : Ptr[yyjson_mut_doc], str : CString): Ptr[yyjson_mut_val] = extern

  /**
   * Creates and returns a raw value, returns NULL on error. The `str` should be a UTF-8 string, null-terminator is not required.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_rawn(doc : Ptr[yyjson_mut_doc], str : CString, len : size_t): Ptr[yyjson_mut_val] = extern

  /**
   * Creates and returns a raw value, returns NULL on error. The `str` should be a UTF-8 string, null-terminator is not required. The input string is copied and held by the document.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_rawncpy(doc : Ptr[yyjson_mut_doc], str : CString, len : size_t): Ptr[yyjson_mut_val] = extern

  /**
   * Read a JSON number.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_read_number(dat : CString, `val` : Ptr[yyjson_mut_val], flg : yyjson_read_flag, alc : Ptr[yyjson_alc], err : Ptr[yyjson_read_err]): CString = extern

  /**
   * Creates and returns an real number value, returns NULL on error.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_real(doc : Ptr[yyjson_mut_doc], num : Double): Ptr[yyjson_mut_val] = extern

  /**
   * Set the value to array. Returns false if input is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_set_arr(`val` : Ptr[yyjson_mut_val]): Boolean = extern

  /**
   * Set the value to bool. Returns false if input is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_set_bool(`val` : Ptr[yyjson_mut_val], num : Boolean): Boolean = extern

  /**
   * Set the value to int. Returns false if input is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_set_int(`val` : Ptr[yyjson_mut_val], num : CInt): Boolean = extern

  /**
   * Set the value to null. Returns false if input is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_set_null(`val` : Ptr[yyjson_mut_val]): Boolean = extern

  /**
   * Set the value to array. Returns false if input is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_set_obj(`val` : Ptr[yyjson_mut_val]): Boolean = extern

  /**
   * Set the value to raw. Returns false if input is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_set_raw(`val` : Ptr[yyjson_mut_val], raw : CString, len : size_t): Boolean = extern

  /**
   * Set the value to real. Returns false if input is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_set_real(`val` : Ptr[yyjson_mut_val], num : Double): Boolean = extern

  /**
   * Set the value to sint. Returns false if input is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_set_sint(`val` : Ptr[yyjson_mut_val], num : int64_t): Boolean = extern

  /**
   * Set the value to string (null-terminated). Returns false if input is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_set_str(`val` : Ptr[yyjson_mut_val], str : CString): Boolean = extern

  /**
   * Set the value to string (with length). Returns false if input is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_set_strn(`val` : Ptr[yyjson_mut_val], str : CString, len : size_t): Boolean = extern

  /**
   * Set the value to uint. Returns false if input is NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_set_uint(`val` : Ptr[yyjson_mut_val], num : uint64_t): Boolean = extern

  /**
   * Creates and returns a signed integer value, returns NULL on error.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_sint(doc : Ptr[yyjson_mut_doc], num : int64_t): Ptr[yyjson_mut_val] = extern

  /**
   * Creates and returns a string value, returns NULL on error. The `str` should be a null-terminated UTF-8 string.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_str(doc : Ptr[yyjson_mut_doc], str : CString): Ptr[yyjson_mut_val] = extern

  /**
   * Creates and returns a string value, returns NULL on error. The `str` should be a null-terminated UTF-8 string. The input string is copied and held by the document.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_strcpy(doc : Ptr[yyjson_mut_doc], str : CString): Ptr[yyjson_mut_val] = extern

  /**
   * Creates and returns a string value, returns NULL on error. The `str` should be a UTF-8 string, null-terminator is not required.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_strn(doc : Ptr[yyjson_mut_doc], str : CString, len : size_t): Ptr[yyjson_mut_val] = extern

  /**
   * Creates and returns a string value, returns NULL on error. The `str` should be a UTF-8 string, null-terminator is not required. The input string is copied and held by the document.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_strncpy(doc : Ptr[yyjson_mut_doc], str : CString, len : size_t): Ptr[yyjson_mut_val] = extern

  /**
   * Creates and returns a true value, returns NULL on error.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_true(doc : Ptr[yyjson_mut_doc]): Ptr[yyjson_mut_val] = extern

  /**
   * Creates and returns an unsigned integer value, returns NULL on error.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_uint(doc : Ptr[yyjson_mut_doc], num : uint64_t): Ptr[yyjson_mut_val] = extern

  /**
   * Copies and returns a new immutable document from input, returns NULL on error. This makes a `deep-copy` on the mutable value. The returned document should be freed with `yyjson_doc_free()`.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_val_imut_copy(`val` : Ptr[yyjson_mut_val], alc : Ptr[yyjson_alc]): Ptr[yyjson_doc] = extern

  /**
   * Copies and returns a new mutable value from input, returns NULL on error. This makes a `deep-copy` on the mutable value. The memory was managed by mutable document.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_val_mut_copy(doc : Ptr[yyjson_mut_doc], `val` : Ptr[yyjson_mut_val]): Ptr[yyjson_mut_val] = extern

  /**
   * Write a value to JSON string.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_val_write(`val` : Ptr[yyjson_mut_val], flg : yyjson_write_flag, len : Ptr[size_t]): CString = extern

  /**
   * Write a value to JSON file with options.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_val_write_file(path : CString, `val` : Ptr[yyjson_mut_val], flg : yyjson_write_flag, alc : Ptr[yyjson_alc], err : Ptr[yyjson_write_err]): Boolean = extern

  /**
   * Write a value to JSON file with options.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_val_write_fp(fp : Ptr[FILE], `val` : Ptr[yyjson_mut_val], flg : yyjson_write_flag, alc : Ptr[yyjson_alc], err : Ptr[yyjson_write_err]): Boolean = extern

  /**
   * Write a value to JSON string with options.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_val_write_opts(`val` : Ptr[yyjson_mut_val], flg : yyjson_write_flag, alc : Ptr[yyjson_alc], len : Ptr[size_t], err : Ptr[yyjson_write_err]): CString = extern

  /**
   * Write a document to JSON string.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_write(doc : Ptr[yyjson_mut_doc], flg : yyjson_write_flag, len : Ptr[size_t]): CString = extern

  /**
   * Write a document to JSON file with options.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_write_file(path : CString, doc : Ptr[yyjson_mut_doc], flg : yyjson_write_flag, alc : Ptr[yyjson_alc], err : Ptr[yyjson_write_err]): Boolean = extern

  /**
   * Write a document to file pointer with options.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_write_fp(fp : Ptr[FILE], doc : Ptr[yyjson_mut_doc], flg : yyjson_write_flag, alc : Ptr[yyjson_alc], err : Ptr[yyjson_write_err]): Boolean = extern

  /**
   * Write a document to JSON string with options.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_write_opts(doc : Ptr[yyjson_mut_doc], flg : yyjson_write_flag, alc : Ptr[yyjson_alc], len : Ptr[size_t], err : Ptr[yyjson_write_err]): CString = extern

  /**
   * Returns the value to which the specified key is mapped. Returns NULL if this object contains no mapping for the key. Returns NULL if `obj/key` is NULL, or type is not object.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  @name("__sn_wrap_lib_yyjson_yyjson_obj_get")
  def yyjson_obj_get(obj : Ptr[yyjson_val], key : CString): Ptr[yyjson_val] = extern

  /**
   * Returns the value to which the specified key is mapped. Returns NULL if this object contains no mapping for the key. Returns NULL if `obj/key` is NULL, or type is not object.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_obj_getn(obj : Ptr[yyjson_val], _key : CString, key_len : size_t): Ptr[yyjson_val] = extern

  /**
   * Iterates to a specified key and returns the value.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_obj_iter_get(iter : Ptr[yyjson_obj_iter], key : CString): Ptr[yyjson_val] = extern

  /**
   * Returns the value for key inside the iteration. If `iter` is NULL, this function will return NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_obj_iter_get_val(key : Ptr[yyjson_val]): Ptr[yyjson_val] = extern

  /**
   * Iterates to a specified key and returns the value.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_obj_iter_getn(iter : Ptr[yyjson_obj_iter], key : CString, key_len : size_t): Ptr[yyjson_val] = extern

  /**
   * Returns whether the iteration has more elements. If `iter` is NULL, this function will return false.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_obj_iter_has_next(iter : Ptr[yyjson_obj_iter]): Boolean = extern

  /**
   * Initialize an iterator for this object.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_obj_iter_init(obj : Ptr[yyjson_val], iter : Ptr[yyjson_obj_iter]): Boolean = extern

  /**
   * Returns the next key in the iteration, or NULL on end. If `iter` is NULL, this function will return NULL.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_obj_iter_next(iter : Ptr[yyjson_obj_iter]): Ptr[yyjson_val] = extern

  /**
   * Returns the number of key-value pairs in this object. Returns 0 if `obj` is NULL or type is not object.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_obj_size(obj : Ptr[yyjson_val]): size_t = extern

  /**
   * Creates and returns a patched JSON value (RFC 6902). The memory of the returned value is allocated by the `doc`. The `err` is used to receive error information, pass NULL if not needed. Returns NULL if the patch could not be applied.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_patch(doc : Ptr[yyjson_mut_doc], orig : Ptr[yyjson_val], patch : Ptr[yyjson_val], err : Ptr[yyjson_patch_err]): Ptr[yyjson_mut_val] = extern

  /**
   * Append value by JSON pointer context.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_ptr_ctx_append(ctx : Ptr[yyjson_ptr_ctx], key : Ptr[yyjson_mut_val], `val` : Ptr[yyjson_mut_val]): Boolean = extern

  /**
   * Remove value by JSON pointer context.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_ptr_ctx_remove(ctx : Ptr[yyjson_ptr_ctx]): Boolean = extern

  /**
   * Replace value by JSON pointer context.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_ptr_ctx_replace(ctx : Ptr[yyjson_ptr_ctx], `val` : Ptr[yyjson_mut_val]): Boolean = extern

  /**
   * Get value by a JSON Pointer.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_ptr_get(`val` : Ptr[yyjson_val], ptr : CString): Ptr[yyjson_val] = extern

  /**
   * Set provided `value` if the JSON Pointer (RFC 6901) exists and is type bool. Returns true if value at `ptr` exists and is the correct type, otherwise false.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_ptr_get_bool(root : Ptr[yyjson_val], ptr : CString, value : Ptr[Boolean]): Boolean = extern

  /**
   * Set provided `value` if the JSON Pointer (RFC 6901) exists and is type sint, uint or real. Returns true if value at `ptr` exists and is the correct type, otherwise false.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_ptr_get_num(root : Ptr[yyjson_val], ptr : CString, value : Ptr[Double]): Boolean = extern

  /**
   * Set provided `value` if the JSON Pointer (RFC 6901) exists and is type real. Returns true if value at `ptr` exists and is the correct type, otherwise false.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_ptr_get_real(root : Ptr[yyjson_val], ptr : CString, value : Ptr[Double]): Boolean = extern

  /**
   * Set provided `value` if the JSON Pointer (RFC 6901) exists and is an integer that fits in `int64_t`. Returns true if successful, otherwise false.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_ptr_get_sint(root : Ptr[yyjson_val], ptr : CString, value : Ptr[int64_t]): Boolean = extern

  /**
   * Set provided `value` if the JSON Pointer (RFC 6901) exists and is type string. Returns true if value at `ptr` exists and is the correct type, otherwise false.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_ptr_get_str(root : Ptr[yyjson_val], ptr : CString, value : Ptr[CString]): Boolean = extern

  /**
   * Set provided `value` if the JSON Pointer (RFC 6901) exists and is an integer that fits in `uint64_t`. Returns true if successful, otherwise false.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_ptr_get_uint(root : Ptr[yyjson_val], ptr : CString, value : Ptr[uint64_t]): Boolean = extern

  /**
   * Get value by a JSON Pointer.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_ptr_getn(`val` : Ptr[yyjson_val], ptr : CString, len : size_t): Ptr[yyjson_val] = extern

  /**
   * Get value by a JSON Pointer.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_ptr_getx(`val` : Ptr[yyjson_val], ptr : CString, len : size_t, err : Ptr[yyjson_ptr_err]): Ptr[yyjson_val] = extern

  /**
   * Read a JSON string.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  @name("__sn_wrap_lib_yyjson_yyjson_read")
  def yyjson_read(dat : CString, len : size_t, flg : yyjson_read_flag): Ptr[yyjson_doc] = extern

  /**
   * Read a JSON file.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_read_file(path : CString, flg : yyjson_read_flag, alc : Ptr[yyjson_alc], err : Ptr[yyjson_read_err]): Ptr[yyjson_doc] = extern

  /**
   * Read JSON from a file pointer.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_read_fp(fp : Ptr[FILE], flg : yyjson_read_flag, alc : Ptr[yyjson_alc], err : Ptr[yyjson_read_err]): Ptr[yyjson_doc] = extern

  /**
   * Returns the size of maximum memory usage to read a JSON data.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_read_max_memory_usage(len : size_t, flg : yyjson_read_flag): size_t = extern

  /**
   * Read a JSON number.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_read_number(dat : CString, `val` : Ptr[yyjson_val], flg : yyjson_read_flag, alc : Ptr[yyjson_alc], err : Ptr[yyjson_read_err]): CString = extern

  /**
   * Read JSON with options.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_read_opts(dat : CString, len : size_t, flg : yyjson_read_flag, alc : Ptr[yyjson_alc], err : Ptr[yyjson_read_err]): Ptr[yyjson_doc] = extern

  /**
   * Set the value to bool. Returns false if input is NULL or `val` is object or array.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_set_bool(`val` : Ptr[yyjson_val], num : Boolean): Boolean = extern

  /**
   * Set the value to int. Returns false if input is NULL or `val` is object or array.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_set_int(`val` : Ptr[yyjson_val], num : CInt): Boolean = extern

  /**
   * Set the value to null. Returns false if input is NULL or `val` is object or array.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_set_null(`val` : Ptr[yyjson_val]): Boolean = extern

  /**
   * Set the value to raw. Returns false if input is NULL or `val` is object or array.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_set_raw(`val` : Ptr[yyjson_val], raw : CString, len : size_t): Boolean = extern

  /**
   * Set the value to real. Returns false if input is NULL or `val` is object or array.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_set_real(`val` : Ptr[yyjson_val], num : Double): Boolean = extern

  /**
   * Set the value to sint. Returns false if input is NULL or `val` is object or array.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_set_sint(`val` : Ptr[yyjson_val], num : int64_t): Boolean = extern

  /**
   * Set the value to string (null-terminated). Returns false if input is NULL or `val` is object or array.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_set_str(`val` : Ptr[yyjson_val], str : CString): Boolean = extern

  /**
   * Set the value to string (with length). Returns false if input is NULL or `val` is object or array.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_set_strn(`val` : Ptr[yyjson_val], str : CString, len : size_t): Boolean = extern

  /**
   * Set the value to uint. Returns false if input is NULL or `val` is object or array.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_set_uint(`val` : Ptr[yyjson_val], num : uint64_t): Boolean = extern

  /**
   * Copies and returns a new mutable value from input, returns NULL on error. This makes a `deep-copy` on the immutable value. The memory was managed by mutable document.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_val_mut_copy(doc : Ptr[yyjson_mut_doc], `val` : Ptr[yyjson_val]): Ptr[yyjson_mut_val] = extern

  /**
   * Write a value to JSON string.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_val_write(`val` : Ptr[yyjson_val], flg : yyjson_write_flag, len : Ptr[size_t]): CString = extern

  /**
   * Write a value to JSON file with options.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_val_write_file(path : CString, `val` : Ptr[yyjson_val], flg : yyjson_write_flag, alc : Ptr[yyjson_alc], err : Ptr[yyjson_write_err]): Boolean = extern

  /**
   * Write a value to file pointer with options.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_val_write_fp(fp : Ptr[FILE], `val` : Ptr[yyjson_val], flg : yyjson_write_flag, alc : Ptr[yyjson_alc], err : Ptr[yyjson_write_err]): Boolean = extern

  /**
   * Write a value to JSON string with options.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_val_write_opts(`val` : Ptr[yyjson_val], flg : yyjson_write_flag, alc : Ptr[yyjson_alc], len : Ptr[size_t], err : Ptr[yyjson_write_err]): CString = extern

  /**
   * The version of yyjson in hex, same as `YYJSON_VERSION_HEX`.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_version(): uint32_t = extern

  /**
   * Write a document to JSON string.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_write(doc : Ptr[yyjson_doc], flg : yyjson_write_flag, len : Ptr[size_t]): CString = extern

  /**
   * Write a document to JSON file with options.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_write_file(path : CString, doc : Ptr[yyjson_doc], flg : yyjson_write_flag, alc : Ptr[yyjson_alc], err : Ptr[yyjson_write_err]): Boolean = extern

  /**
   * Write a document to file pointer with options.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_write_fp(fp : Ptr[FILE], doc : Ptr[yyjson_doc], flg : yyjson_write_flag, alc : Ptr[yyjson_alc], err : Ptr[yyjson_write_err]): Boolean = extern

  /**
   * Write a document to JSON string with options.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_write_opts(doc : Ptr[yyjson_doc], flg : yyjson_write_flag, alc : Ptr[yyjson_alc], len : Ptr[size_t], err : Ptr[yyjson_write_err]): CString = extern


object functions:
  import _root_.lib_yyjson.aliases.*
  import _root_.lib_yyjson.structs.*
  import _root_.lib_yyjson.unions.*
  import extern_functions.*
  export extern_functions.*

  /**
   * Create an iterator with an array , same as `yyjson_arr_iter_init()`.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_arr_iter_with(arr : Ptr[yyjson_val])(using Zone): yyjson_arr_iter =
    val __ptr_0: Ptr[yyjson_arr_iter] = alloc[yyjson_arr_iter](1)
    __sn_wrap_lib_yyjson_yyjson_arr_iter_with(arr, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Create an iterator with an array , same as `yyjson_arr_iter_init()`.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_arr_iter_with(arr : Ptr[yyjson_val])(__return : Ptr[yyjson_arr_iter]): Unit =
    __sn_wrap_lib_yyjson_yyjson_arr_iter_with(arr, __return)

  /**
   * Create an iterator with an array , same as `yyjson_mut_arr_iter_init()`.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_iter_with(arr : Ptr[yyjson_mut_val])(__return : Ptr[yyjson_mut_arr_iter]): Unit =
    __sn_wrap_lib_yyjson_yyjson_mut_arr_iter_with(arr, __return)

  /**
   * Create an iterator with an array , same as `yyjson_mut_arr_iter_init()`.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_arr_iter_with(arr : Ptr[yyjson_mut_val])(using Zone): yyjson_mut_arr_iter =
    val __ptr_0: Ptr[yyjson_mut_arr_iter] = alloc[yyjson_mut_arr_iter](1)
    __sn_wrap_lib_yyjson_yyjson_mut_arr_iter_with(arr, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Create an iterator with an object, same as `yyjson_obj_iter_init()`.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_obj_iter_with(obj : Ptr[yyjson_mut_val])(__return : Ptr[yyjson_mut_obj_iter]): Unit =
    __sn_wrap_lib_yyjson_yyjson_mut_obj_iter_with(obj, __return)

  /**
   * Create an iterator with an object, same as `yyjson_obj_iter_init()`.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_mut_obj_iter_with(obj : Ptr[yyjson_mut_val])(using Zone): yyjson_mut_obj_iter =
    val __ptr_0: Ptr[yyjson_mut_obj_iter] = alloc[yyjson_mut_obj_iter](1)
    __sn_wrap_lib_yyjson_yyjson_mut_obj_iter_with(obj, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Create an iterator with an object, same as `yyjson_obj_iter_init()`.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_obj_iter_with(obj : Ptr[yyjson_val])(using Zone): yyjson_obj_iter =
    val __ptr_0: Ptr[yyjson_obj_iter] = alloc[yyjson_obj_iter](1)
    __sn_wrap_lib_yyjson_yyjson_obj_iter_with(obj, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Create an iterator with an object, same as `yyjson_obj_iter_init()`.

   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/yyjson.h
  */
  def yyjson_obj_iter_with(obj : Ptr[yyjson_val])(__return : Ptr[yyjson_obj_iter]): Unit =
    __sn_wrap_lib_yyjson_yyjson_obj_iter_with(obj, __return)

object types:
  export _root_.lib_yyjson.structs.*
  export _root_.lib_yyjson.aliases.*
  export _root_.lib_yyjson.unions.*

object all:
  export _root_.lib_yyjson.aliases.FILE
  export _root_.lib_yyjson.aliases.int16_t
  export _root_.lib_yyjson.aliases.int32_t
  export _root_.lib_yyjson.aliases.int64_t
  export _root_.lib_yyjson.aliases.int8_t
  export _root_.lib_yyjson.aliases.size_t
  export _root_.lib_yyjson.aliases.uint16_t
  export _root_.lib_yyjson.aliases.uint32_t
  export _root_.lib_yyjson.aliases.uint64_t
  export _root_.lib_yyjson.aliases.uint8_t
  export _root_.lib_yyjson.aliases.yyjson_patch_code
  export _root_.lib_yyjson.aliases.yyjson_ptr_code
  export _root_.lib_yyjson.aliases.yyjson_read_code
  export _root_.lib_yyjson.aliases.yyjson_read_flag
  export _root_.lib_yyjson.aliases.yyjson_subtype
  export _root_.lib_yyjson.aliases.yyjson_type
  export _root_.lib_yyjson.aliases.yyjson_write_code
  export _root_.lib_yyjson.aliases.yyjson_write_flag
  export _root_.lib_yyjson.structs.yyjson_alc
  export _root_.lib_yyjson.structs.yyjson_arr_iter
  export _root_.lib_yyjson.structs.yyjson_doc
  export _root_.lib_yyjson.structs.yyjson_mut_arr_iter
  export _root_.lib_yyjson.structs.yyjson_mut_doc
  export _root_.lib_yyjson.structs.yyjson_mut_obj_iter
  export _root_.lib_yyjson.structs.yyjson_mut_val
  export _root_.lib_yyjson.structs.yyjson_obj_iter
  export _root_.lib_yyjson.structs.yyjson_patch_err
  export _root_.lib_yyjson.structs.yyjson_ptr_ctx
  export _root_.lib_yyjson.structs.yyjson_ptr_err
  export _root_.lib_yyjson.structs.yyjson_read_err
  export _root_.lib_yyjson.structs.yyjson_str_chunk
  export _root_.lib_yyjson.structs.yyjson_str_pool
  export _root_.lib_yyjson.structs.yyjson_val
  export _root_.lib_yyjson.structs.yyjson_val_chunk
  export _root_.lib_yyjson.structs.yyjson_val_pool
  export _root_.lib_yyjson.structs.yyjson_write_err
  export _root_.lib_yyjson.unions.yyjson_val_uni
  export _root_.lib_yyjson.functions.unsafe_yyjson_arr_is_flat
  export _root_.lib_yyjson.functions.unsafe_yyjson_equals
  export _root_.lib_yyjson.functions.unsafe_yyjson_equals_str
  export _root_.lib_yyjson.functions.unsafe_yyjson_equals_strn
  export _root_.lib_yyjson.functions.unsafe_yyjson_get_bool
  export _root_.lib_yyjson.functions.unsafe_yyjson_get_first
  export _root_.lib_yyjson.functions.unsafe_yyjson_get_int
  export _root_.lib_yyjson.functions.unsafe_yyjson_get_len
  export _root_.lib_yyjson.functions.unsafe_yyjson_get_next
  export _root_.lib_yyjson.functions.unsafe_yyjson_get_num
  export _root_.lib_yyjson.functions.unsafe_yyjson_get_pointer
  export _root_.lib_yyjson.functions.unsafe_yyjson_get_raw
  export _root_.lib_yyjson.functions.unsafe_yyjson_get_real
  export _root_.lib_yyjson.functions.unsafe_yyjson_get_sint
  export _root_.lib_yyjson.functions.unsafe_yyjson_get_str
  export _root_.lib_yyjson.functions.unsafe_yyjson_get_subtype
  export _root_.lib_yyjson.functions.unsafe_yyjson_get_tag
  export _root_.lib_yyjson.functions.unsafe_yyjson_get_type
  export _root_.lib_yyjson.functions.unsafe_yyjson_get_uint
  export _root_.lib_yyjson.functions.unsafe_yyjson_inc_len
  export _root_.lib_yyjson.functions.unsafe_yyjson_is_arr
  export _root_.lib_yyjson.functions.unsafe_yyjson_is_bool
  export _root_.lib_yyjson.functions.unsafe_yyjson_is_ctn
  export _root_.lib_yyjson.functions.unsafe_yyjson_is_false
  export _root_.lib_yyjson.functions.unsafe_yyjson_is_int
  export _root_.lib_yyjson.functions.unsafe_yyjson_is_null
  export _root_.lib_yyjson.functions.unsafe_yyjson_is_num
  export _root_.lib_yyjson.functions.unsafe_yyjson_is_obj
  export _root_.lib_yyjson.functions.unsafe_yyjson_is_raw
  export _root_.lib_yyjson.functions.unsafe_yyjson_is_real
  export _root_.lib_yyjson.functions.unsafe_yyjson_is_sint
  export _root_.lib_yyjson.functions.unsafe_yyjson_is_str
  export _root_.lib_yyjson.functions.unsafe_yyjson_is_str_noesc
  export _root_.lib_yyjson.functions.unsafe_yyjson_is_true
  export _root_.lib_yyjson.functions.unsafe_yyjson_is_uint
  export _root_.lib_yyjson.functions.unsafe_yyjson_mut_equals
  export _root_.lib_yyjson.functions.unsafe_yyjson_mut_get_pointer
  export _root_.lib_yyjson.functions.unsafe_yyjson_mut_obj_add
  export _root_.lib_yyjson.functions.unsafe_yyjson_mut_obj_remove
  export _root_.lib_yyjson.functions.unsafe_yyjson_mut_obj_replace
  export _root_.lib_yyjson.functions.unsafe_yyjson_mut_obj_rotate
  export _root_.lib_yyjson.functions.unsafe_yyjson_mut_ptr_getx
  export _root_.lib_yyjson.functions.unsafe_yyjson_mut_ptr_putx
  export _root_.lib_yyjson.functions.unsafe_yyjson_mut_ptr_removex
  export _root_.lib_yyjson.functions.unsafe_yyjson_mut_ptr_replacex
  export _root_.lib_yyjson.functions.unsafe_yyjson_mut_str_alc
  export _root_.lib_yyjson.functions.unsafe_yyjson_mut_strncpy
  export _root_.lib_yyjson.functions.unsafe_yyjson_mut_val
  export _root_.lib_yyjson.functions.unsafe_yyjson_ptr_getx
  export _root_.lib_yyjson.functions.unsafe_yyjson_set_arr
  export _root_.lib_yyjson.functions.unsafe_yyjson_set_bool
  export _root_.lib_yyjson.functions.unsafe_yyjson_set_len
  export _root_.lib_yyjson.functions.unsafe_yyjson_set_null
  export _root_.lib_yyjson.functions.unsafe_yyjson_set_obj
  export _root_.lib_yyjson.functions.unsafe_yyjson_set_raw
  export _root_.lib_yyjson.functions.unsafe_yyjson_set_real
  export _root_.lib_yyjson.functions.unsafe_yyjson_set_sint
  export _root_.lib_yyjson.functions.unsafe_yyjson_set_str
  export _root_.lib_yyjson.functions.unsafe_yyjson_set_strn
  export _root_.lib_yyjson.functions.unsafe_yyjson_set_type
  export _root_.lib_yyjson.functions.unsafe_yyjson_set_uint
  export _root_.lib_yyjson.functions.unsafe_yyjson_str_pool_grow
  export _root_.lib_yyjson.functions.unsafe_yyjson_val_pool_grow
  export _root_.lib_yyjson.functions.yyjson_alc_dyn_free
  export _root_.lib_yyjson.functions.yyjson_alc_dyn_new
  export _root_.lib_yyjson.functions.yyjson_alc_pool_init
  export _root_.lib_yyjson.functions.yyjson_arr_get
  export _root_.lib_yyjson.functions.yyjson_arr_get_first
  export _root_.lib_yyjson.functions.yyjson_arr_get_last
  export _root_.lib_yyjson.functions.yyjson_arr_iter_has_next
  export _root_.lib_yyjson.functions.yyjson_arr_iter_init
  export _root_.lib_yyjson.functions.yyjson_arr_iter_next
  export _root_.lib_yyjson.functions.yyjson_arr_size
  export _root_.lib_yyjson.functions.yyjson_doc_free
  export _root_.lib_yyjson.functions.yyjson_doc_get_pointer
  export _root_.lib_yyjson.functions.yyjson_doc_get_pointern
  export _root_.lib_yyjson.functions.yyjson_doc_get_read_size
  export _root_.lib_yyjson.functions.yyjson_doc_get_root
  export _root_.lib_yyjson.functions.yyjson_doc_get_val_count
  export _root_.lib_yyjson.functions.yyjson_doc_mut_copy
  export _root_.lib_yyjson.functions.yyjson_doc_ptr_get
  export _root_.lib_yyjson.functions.yyjson_doc_ptr_getn
  export _root_.lib_yyjson.functions.yyjson_doc_ptr_getx
  export _root_.lib_yyjson.functions.yyjson_equals
  export _root_.lib_yyjson.functions.yyjson_equals_str
  export _root_.lib_yyjson.functions.yyjson_equals_strn
  export _root_.lib_yyjson.functions.yyjson_get_bool
  export _root_.lib_yyjson.functions.yyjson_get_int
  export _root_.lib_yyjson.functions.yyjson_get_len
  export _root_.lib_yyjson.functions.yyjson_get_num
  export _root_.lib_yyjson.functions.yyjson_get_pointer
  export _root_.lib_yyjson.functions.yyjson_get_pointern
  export _root_.lib_yyjson.functions.yyjson_get_raw
  export _root_.lib_yyjson.functions.yyjson_get_real
  export _root_.lib_yyjson.functions.yyjson_get_sint
  export _root_.lib_yyjson.functions.yyjson_get_str
  export _root_.lib_yyjson.functions.yyjson_get_subtype
  export _root_.lib_yyjson.functions.yyjson_get_tag
  export _root_.lib_yyjson.functions.yyjson_get_type
  export _root_.lib_yyjson.functions.yyjson_get_type_desc
  export _root_.lib_yyjson.functions.yyjson_get_uint
  export _root_.lib_yyjson.functions.yyjson_is_arr
  export _root_.lib_yyjson.functions.yyjson_is_bool
  export _root_.lib_yyjson.functions.yyjson_is_ctn
  export _root_.lib_yyjson.functions.yyjson_is_false
  export _root_.lib_yyjson.functions.yyjson_is_int
  export _root_.lib_yyjson.functions.yyjson_is_null
  export _root_.lib_yyjson.functions.yyjson_is_num
  export _root_.lib_yyjson.functions.yyjson_is_obj
  export _root_.lib_yyjson.functions.yyjson_is_raw
  export _root_.lib_yyjson.functions.yyjson_is_real
  export _root_.lib_yyjson.functions.yyjson_is_sint
  export _root_.lib_yyjson.functions.yyjson_is_str
  export _root_.lib_yyjson.functions.yyjson_is_true
  export _root_.lib_yyjson.functions.yyjson_is_uint
  export _root_.lib_yyjson.functions.yyjson_locate_pos
  export _root_.lib_yyjson.functions.yyjson_merge_patch
  export _root_.lib_yyjson.functions.yyjson_mut_arr
  export _root_.lib_yyjson.functions.yyjson_mut_arr_add_arr
  export _root_.lib_yyjson.functions.yyjson_mut_arr_add_bool
  export _root_.lib_yyjson.functions.yyjson_mut_arr_add_false
  export _root_.lib_yyjson.functions.yyjson_mut_arr_add_int
  export _root_.lib_yyjson.functions.yyjson_mut_arr_add_null
  export _root_.lib_yyjson.functions.yyjson_mut_arr_add_obj
  export _root_.lib_yyjson.functions.yyjson_mut_arr_add_real
  export _root_.lib_yyjson.functions.yyjson_mut_arr_add_sint
  export _root_.lib_yyjson.functions.yyjson_mut_arr_add_str
  export _root_.lib_yyjson.functions.yyjson_mut_arr_add_strcpy
  export _root_.lib_yyjson.functions.yyjson_mut_arr_add_strn
  export _root_.lib_yyjson.functions.yyjson_mut_arr_add_strncpy
  export _root_.lib_yyjson.functions.yyjson_mut_arr_add_true
  export _root_.lib_yyjson.functions.yyjson_mut_arr_add_uint
  export _root_.lib_yyjson.functions.yyjson_mut_arr_add_val
  export _root_.lib_yyjson.functions.yyjson_mut_arr_append
  export _root_.lib_yyjson.functions.yyjson_mut_arr_clear
  export _root_.lib_yyjson.functions.yyjson_mut_arr_get
  export _root_.lib_yyjson.functions.yyjson_mut_arr_get_first
  export _root_.lib_yyjson.functions.yyjson_mut_arr_get_last
  export _root_.lib_yyjson.functions.yyjson_mut_arr_insert
  export _root_.lib_yyjson.functions.yyjson_mut_arr_iter_has_next
  export _root_.lib_yyjson.functions.yyjson_mut_arr_iter_init
  export _root_.lib_yyjson.functions.yyjson_mut_arr_iter_next
  export _root_.lib_yyjson.functions.yyjson_mut_arr_iter_remove
  export _root_.lib_yyjson.functions.yyjson_mut_arr_prepend
  export _root_.lib_yyjson.functions.yyjson_mut_arr_remove
  export _root_.lib_yyjson.functions.yyjson_mut_arr_remove_first
  export _root_.lib_yyjson.functions.yyjson_mut_arr_remove_last
  export _root_.lib_yyjson.functions.yyjson_mut_arr_remove_range
  export _root_.lib_yyjson.functions.yyjson_mut_arr_replace
  export _root_.lib_yyjson.functions.yyjson_mut_arr_rotate
  export _root_.lib_yyjson.functions.yyjson_mut_arr_size
  export _root_.lib_yyjson.functions.yyjson_mut_arr_with_bool
  export _root_.lib_yyjson.functions.yyjson_mut_arr_with_double
  export _root_.lib_yyjson.functions.yyjson_mut_arr_with_float
  export _root_.lib_yyjson.functions.yyjson_mut_arr_with_real
  export _root_.lib_yyjson.functions.yyjson_mut_arr_with_sint
  export _root_.lib_yyjson.functions.yyjson_mut_arr_with_sint16
  export _root_.lib_yyjson.functions.yyjson_mut_arr_with_sint32
  export _root_.lib_yyjson.functions.yyjson_mut_arr_with_sint64
  export _root_.lib_yyjson.functions.yyjson_mut_arr_with_sint8
  export _root_.lib_yyjson.functions.yyjson_mut_arr_with_str
  export _root_.lib_yyjson.functions.yyjson_mut_arr_with_strcpy
  export _root_.lib_yyjson.functions.yyjson_mut_arr_with_strn
  export _root_.lib_yyjson.functions.yyjson_mut_arr_with_strncpy
  export _root_.lib_yyjson.functions.yyjson_mut_arr_with_uint
  export _root_.lib_yyjson.functions.yyjson_mut_arr_with_uint16
  export _root_.lib_yyjson.functions.yyjson_mut_arr_with_uint32
  export _root_.lib_yyjson.functions.yyjson_mut_arr_with_uint64
  export _root_.lib_yyjson.functions.yyjson_mut_arr_with_uint8
  export _root_.lib_yyjson.functions.yyjson_mut_bool
  export _root_.lib_yyjson.functions.yyjson_mut_doc_free
  export _root_.lib_yyjson.functions.yyjson_mut_doc_get_pointer
  export _root_.lib_yyjson.functions.yyjson_mut_doc_get_pointern
  export _root_.lib_yyjson.functions.yyjson_mut_doc_get_root
  export _root_.lib_yyjson.functions.yyjson_mut_doc_imut_copy
  export _root_.lib_yyjson.functions.yyjson_mut_doc_mut_copy
  export _root_.lib_yyjson.functions.yyjson_mut_doc_new
  export _root_.lib_yyjson.functions.yyjson_mut_doc_ptr_add
  export _root_.lib_yyjson.functions.yyjson_mut_doc_ptr_addn
  export _root_.lib_yyjson.functions.yyjson_mut_doc_ptr_addx
  export _root_.lib_yyjson.functions.yyjson_mut_doc_ptr_get
  export _root_.lib_yyjson.functions.yyjson_mut_doc_ptr_getn
  export _root_.lib_yyjson.functions.yyjson_mut_doc_ptr_getx
  export _root_.lib_yyjson.functions.yyjson_mut_doc_ptr_remove
  export _root_.lib_yyjson.functions.yyjson_mut_doc_ptr_removen
  export _root_.lib_yyjson.functions.yyjson_mut_doc_ptr_removex
  export _root_.lib_yyjson.functions.yyjson_mut_doc_ptr_replace
  export _root_.lib_yyjson.functions.yyjson_mut_doc_ptr_replacen
  export _root_.lib_yyjson.functions.yyjson_mut_doc_ptr_replacex
  export _root_.lib_yyjson.functions.yyjson_mut_doc_ptr_set
  export _root_.lib_yyjson.functions.yyjson_mut_doc_ptr_setn
  export _root_.lib_yyjson.functions.yyjson_mut_doc_ptr_setx
  export _root_.lib_yyjson.functions.yyjson_mut_doc_set_root
  export _root_.lib_yyjson.functions.yyjson_mut_doc_set_str_pool_size
  export _root_.lib_yyjson.functions.yyjson_mut_doc_set_val_pool_size
  export _root_.lib_yyjson.functions.yyjson_mut_equals
  export _root_.lib_yyjson.functions.yyjson_mut_equals_str
  export _root_.lib_yyjson.functions.yyjson_mut_equals_strn
  export _root_.lib_yyjson.functions.yyjson_mut_false
  export _root_.lib_yyjson.functions.yyjson_mut_get_bool
  export _root_.lib_yyjson.functions.yyjson_mut_get_int
  export _root_.lib_yyjson.functions.yyjson_mut_get_len
  export _root_.lib_yyjson.functions.yyjson_mut_get_num
  export _root_.lib_yyjson.functions.yyjson_mut_get_pointer
  export _root_.lib_yyjson.functions.yyjson_mut_get_pointern
  export _root_.lib_yyjson.functions.yyjson_mut_get_raw
  export _root_.lib_yyjson.functions.yyjson_mut_get_real
  export _root_.lib_yyjson.functions.yyjson_mut_get_sint
  export _root_.lib_yyjson.functions.yyjson_mut_get_str
  export _root_.lib_yyjson.functions.yyjson_mut_get_subtype
  export _root_.lib_yyjson.functions.yyjson_mut_get_tag
  export _root_.lib_yyjson.functions.yyjson_mut_get_type
  export _root_.lib_yyjson.functions.yyjson_mut_get_type_desc
  export _root_.lib_yyjson.functions.yyjson_mut_get_uint
  export _root_.lib_yyjson.functions.yyjson_mut_int
  export _root_.lib_yyjson.functions.yyjson_mut_is_arr
  export _root_.lib_yyjson.functions.yyjson_mut_is_bool
  export _root_.lib_yyjson.functions.yyjson_mut_is_ctn
  export _root_.lib_yyjson.functions.yyjson_mut_is_false
  export _root_.lib_yyjson.functions.yyjson_mut_is_int
  export _root_.lib_yyjson.functions.yyjson_mut_is_null
  export _root_.lib_yyjson.functions.yyjson_mut_is_num
  export _root_.lib_yyjson.functions.yyjson_mut_is_obj
  export _root_.lib_yyjson.functions.yyjson_mut_is_raw
  export _root_.lib_yyjson.functions.yyjson_mut_is_real
  export _root_.lib_yyjson.functions.yyjson_mut_is_sint
  export _root_.lib_yyjson.functions.yyjson_mut_is_str
  export _root_.lib_yyjson.functions.yyjson_mut_is_true
  export _root_.lib_yyjson.functions.yyjson_mut_is_uint
  export _root_.lib_yyjson.functions.yyjson_mut_merge_patch
  export _root_.lib_yyjson.functions.yyjson_mut_null
  export _root_.lib_yyjson.functions.yyjson_mut_obj
  export _root_.lib_yyjson.functions.yyjson_mut_obj_add
  export _root_.lib_yyjson.functions.yyjson_mut_obj_add_arr
  export _root_.lib_yyjson.functions.yyjson_mut_obj_add_bool
  export _root_.lib_yyjson.functions.yyjson_mut_obj_add_false
  export _root_.lib_yyjson.functions.yyjson_mut_obj_add_int
  export _root_.lib_yyjson.functions.yyjson_mut_obj_add_null
  export _root_.lib_yyjson.functions.yyjson_mut_obj_add_obj
  export _root_.lib_yyjson.functions.yyjson_mut_obj_add_real
  export _root_.lib_yyjson.functions.yyjson_mut_obj_add_sint
  export _root_.lib_yyjson.functions.yyjson_mut_obj_add_str
  export _root_.lib_yyjson.functions.yyjson_mut_obj_add_strcpy
  export _root_.lib_yyjson.functions.yyjson_mut_obj_add_strn
  export _root_.lib_yyjson.functions.yyjson_mut_obj_add_strncpy
  export _root_.lib_yyjson.functions.yyjson_mut_obj_add_true
  export _root_.lib_yyjson.functions.yyjson_mut_obj_add_uint
  export _root_.lib_yyjson.functions.yyjson_mut_obj_add_val
  export _root_.lib_yyjson.functions.yyjson_mut_obj_clear
  export _root_.lib_yyjson.functions.yyjson_mut_obj_get
  export _root_.lib_yyjson.functions.yyjson_mut_obj_getn
  export _root_.lib_yyjson.functions.yyjson_mut_obj_insert
  export _root_.lib_yyjson.functions.yyjson_mut_obj_iter_get
  export _root_.lib_yyjson.functions.yyjson_mut_obj_iter_get_val
  export _root_.lib_yyjson.functions.yyjson_mut_obj_iter_getn
  export _root_.lib_yyjson.functions.yyjson_mut_obj_iter_has_next
  export _root_.lib_yyjson.functions.yyjson_mut_obj_iter_init
  export _root_.lib_yyjson.functions.yyjson_mut_obj_iter_next
  export _root_.lib_yyjson.functions.yyjson_mut_obj_iter_remove
  export _root_.lib_yyjson.functions.yyjson_mut_obj_put
  export _root_.lib_yyjson.functions.yyjson_mut_obj_remove
  export _root_.lib_yyjson.functions.yyjson_mut_obj_remove_key
  export _root_.lib_yyjson.functions.yyjson_mut_obj_remove_keyn
  export _root_.lib_yyjson.functions.yyjson_mut_obj_remove_str
  export _root_.lib_yyjson.functions.yyjson_mut_obj_remove_strn
  export _root_.lib_yyjson.functions.yyjson_mut_obj_rename_key
  export _root_.lib_yyjson.functions.yyjson_mut_obj_rename_keyn
  export _root_.lib_yyjson.functions.yyjson_mut_obj_replace
  export _root_.lib_yyjson.functions.yyjson_mut_obj_rotate
  export _root_.lib_yyjson.functions.yyjson_mut_obj_size
  export _root_.lib_yyjson.functions.yyjson_mut_obj_with_kv
  export _root_.lib_yyjson.functions.yyjson_mut_obj_with_str
  export _root_.lib_yyjson.functions.yyjson_mut_patch
  export _root_.lib_yyjson.functions.yyjson_mut_ptr_add
  export _root_.lib_yyjson.functions.yyjson_mut_ptr_addn
  export _root_.lib_yyjson.functions.yyjson_mut_ptr_addx
  export _root_.lib_yyjson.functions.yyjson_mut_ptr_get
  export _root_.lib_yyjson.functions.yyjson_mut_ptr_getn
  export _root_.lib_yyjson.functions.yyjson_mut_ptr_getx
  export _root_.lib_yyjson.functions.yyjson_mut_ptr_remove
  export _root_.lib_yyjson.functions.yyjson_mut_ptr_removen
  export _root_.lib_yyjson.functions.yyjson_mut_ptr_removex
  export _root_.lib_yyjson.functions.yyjson_mut_ptr_replace
  export _root_.lib_yyjson.functions.yyjson_mut_ptr_replacen
  export _root_.lib_yyjson.functions.yyjson_mut_ptr_replacex
  export _root_.lib_yyjson.functions.yyjson_mut_ptr_set
  export _root_.lib_yyjson.functions.yyjson_mut_ptr_setn
  export _root_.lib_yyjson.functions.yyjson_mut_ptr_setx
  export _root_.lib_yyjson.functions.yyjson_mut_raw
  export _root_.lib_yyjson.functions.yyjson_mut_rawcpy
  export _root_.lib_yyjson.functions.yyjson_mut_rawn
  export _root_.lib_yyjson.functions.yyjson_mut_rawncpy
  export _root_.lib_yyjson.functions.yyjson_mut_read_number
  export _root_.lib_yyjson.functions.yyjson_mut_real
  export _root_.lib_yyjson.functions.yyjson_mut_set_arr
  export _root_.lib_yyjson.functions.yyjson_mut_set_bool
  export _root_.lib_yyjson.functions.yyjson_mut_set_int
  export _root_.lib_yyjson.functions.yyjson_mut_set_null
  export _root_.lib_yyjson.functions.yyjson_mut_set_obj
  export _root_.lib_yyjson.functions.yyjson_mut_set_raw
  export _root_.lib_yyjson.functions.yyjson_mut_set_real
  export _root_.lib_yyjson.functions.yyjson_mut_set_sint
  export _root_.lib_yyjson.functions.yyjson_mut_set_str
  export _root_.lib_yyjson.functions.yyjson_mut_set_strn
  export _root_.lib_yyjson.functions.yyjson_mut_set_uint
  export _root_.lib_yyjson.functions.yyjson_mut_sint
  export _root_.lib_yyjson.functions.yyjson_mut_str
  export _root_.lib_yyjson.functions.yyjson_mut_strcpy
  export _root_.lib_yyjson.functions.yyjson_mut_strn
  export _root_.lib_yyjson.functions.yyjson_mut_strncpy
  export _root_.lib_yyjson.functions.yyjson_mut_true
  export _root_.lib_yyjson.functions.yyjson_mut_uint
  export _root_.lib_yyjson.functions.yyjson_mut_val_imut_copy
  export _root_.lib_yyjson.functions.yyjson_mut_val_mut_copy
  export _root_.lib_yyjson.functions.yyjson_mut_val_write
  export _root_.lib_yyjson.functions.yyjson_mut_val_write_file
  export _root_.lib_yyjson.functions.yyjson_mut_val_write_fp
  export _root_.lib_yyjson.functions.yyjson_mut_val_write_opts
  export _root_.lib_yyjson.functions.yyjson_mut_write
  export _root_.lib_yyjson.functions.yyjson_mut_write_file
  export _root_.lib_yyjson.functions.yyjson_mut_write_fp
  export _root_.lib_yyjson.functions.yyjson_mut_write_opts
  export _root_.lib_yyjson.functions.yyjson_obj_get
  export _root_.lib_yyjson.functions.yyjson_obj_getn
  export _root_.lib_yyjson.functions.yyjson_obj_iter_get
  export _root_.lib_yyjson.functions.yyjson_obj_iter_get_val
  export _root_.lib_yyjson.functions.yyjson_obj_iter_getn
  export _root_.lib_yyjson.functions.yyjson_obj_iter_has_next
  export _root_.lib_yyjson.functions.yyjson_obj_iter_init
  export _root_.lib_yyjson.functions.yyjson_obj_iter_next
  export _root_.lib_yyjson.functions.yyjson_obj_size
  export _root_.lib_yyjson.functions.yyjson_patch
  export _root_.lib_yyjson.functions.yyjson_ptr_ctx_append
  export _root_.lib_yyjson.functions.yyjson_ptr_ctx_remove
  export _root_.lib_yyjson.functions.yyjson_ptr_ctx_replace
  export _root_.lib_yyjson.functions.yyjson_ptr_get
  export _root_.lib_yyjson.functions.yyjson_ptr_get_bool
  export _root_.lib_yyjson.functions.yyjson_ptr_get_num
  export _root_.lib_yyjson.functions.yyjson_ptr_get_real
  export _root_.lib_yyjson.functions.yyjson_ptr_get_sint
  export _root_.lib_yyjson.functions.yyjson_ptr_get_str
  export _root_.lib_yyjson.functions.yyjson_ptr_get_uint
  export _root_.lib_yyjson.functions.yyjson_ptr_getn
  export _root_.lib_yyjson.functions.yyjson_ptr_getx
  export _root_.lib_yyjson.functions.yyjson_read
  export _root_.lib_yyjson.functions.yyjson_read_file
  export _root_.lib_yyjson.functions.yyjson_read_fp
  export _root_.lib_yyjson.functions.yyjson_read_max_memory_usage
  export _root_.lib_yyjson.functions.yyjson_read_number
  export _root_.lib_yyjson.functions.yyjson_read_opts
  export _root_.lib_yyjson.functions.yyjson_set_bool
  export _root_.lib_yyjson.functions.yyjson_set_int
  export _root_.lib_yyjson.functions.yyjson_set_null
  export _root_.lib_yyjson.functions.yyjson_set_raw
  export _root_.lib_yyjson.functions.yyjson_set_real
  export _root_.lib_yyjson.functions.yyjson_set_sint
  export _root_.lib_yyjson.functions.yyjson_set_str
  export _root_.lib_yyjson.functions.yyjson_set_strn
  export _root_.lib_yyjson.functions.yyjson_set_uint
  export _root_.lib_yyjson.functions.yyjson_val_mut_copy
  export _root_.lib_yyjson.functions.yyjson_val_write
  export _root_.lib_yyjson.functions.yyjson_val_write_file
  export _root_.lib_yyjson.functions.yyjson_val_write_fp
  export _root_.lib_yyjson.functions.yyjson_val_write_opts
  export _root_.lib_yyjson.functions.yyjson_version
  export _root_.lib_yyjson.functions.yyjson_write
  export _root_.lib_yyjson.functions.yyjson_write_file
  export _root_.lib_yyjson.functions.yyjson_write_fp
  export _root_.lib_yyjson.functions.yyjson_write_opts
  export _root_.lib_yyjson.functions.yyjson_arr_iter_with
  export _root_.lib_yyjson.functions.yyjson_mut_arr_iter_with
  export _root_.lib_yyjson.functions.yyjson_mut_obj_iter_with
  export _root_.lib_yyjson.functions.yyjson_obj_iter_with
