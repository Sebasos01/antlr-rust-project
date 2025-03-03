pub unsafe extern "C" fn insertion_sort(n: libc::c_int, p: *mut libc::c_int) {
    let mut i: libc::c_int = 1;
    while i < n {
        let tmp: libc::c_int = *p.offset(i as isize);
        let mut j: libc::c_int = i;
        while j > 0 && *p.offset((j - 1) as isize) > tmp {
            *p.offset(j as isize) = *p.offset((j - 1) as isize);
            j -= 1;
        }
        *p.offset(j as isize) = tmp;
        i += 1;
    }
}
