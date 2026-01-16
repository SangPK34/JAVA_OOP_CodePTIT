package J07013_DS_Sinh_vien_trong_file_nhi_phan;
import java.util.*;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class SinhVien implements Serializable{
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{ 
        File f = new File("SV.in");

            FileInputStream fis = new FileInputStream(f);
            CompatibleObjectInputStream ois = new CompatibleObjectInputStream(fis);

            Object obj = ois.readObject(); 

            @SuppressWarnings("unchecked")
            ArrayList<SinhVien> lst = (ArrayList<SinhVien>) obj;
            for (SinhVien sv : lst) {
                System.out.println(sv);
            }

    }
    static class CompatibleObjectInputStream extends ObjectInputStream {
        public CompatibleObjectInputStream(InputStream in) throws IOException {
            super(in);
        }

        @Override
        protected ObjectStreamClass readClassDescriptor() throws IOException, ClassNotFoundException {
            ObjectStreamClass streamDesc = super.readClassDescriptor();
            if ("danhsachsinhvien1.SinhVien".equals(streamDesc.getName())) {
                ObjectStreamClass localDesc = ObjectStreamClass.lookup(SinhVien.class);
                if (localDesc != null) {
                    // trả về descriptor của lớp hiện tại (gồm serialVersionUID hiện tại)
                    return localDesc;
                }
            }
            return streamDesc;
        }
    }

    private String ma, ten, lop;
    private Date ngaysinh;
    private float gpa;
    SinhVien(String name, String lop, Date date, float Gpa) {
        this.ma = String.format("B20DCCN%03d", countId.next());
        this.ten = name;
        this.lop = lop;
        this.ngaysinh = date;
        this.gpa = Gpa;
    }
    SinhVien(String name, String lop, String ngaysinh, float Gpa) {
        this(name, lop, new Date(), Gpa);
        try {
            this.ngaysinh = parseToDate(ngaysinh);
        } catch (ParseException e) {
            // System.out.println("Sai định dạng ngày sinh: " + ngaysinh + ". Sử dụng ngày mặc định 01/01/2000");
            try {
                this.ngaysinh = parseToDate("01/01/2000");
            } catch (ParseException ex) {
                // Không bao giờ xảy ra
            }
        }
    }

    private static Date parseToDate(String s) throws ParseException{
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        return f.parse(s);
    }
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return String.format("%s %s %s %s %.2f", ma, ten, lop, sdf.format(ngaysinh), gpa);
    }
    
}

class countId {
    public static int id =0;
    public static int next(){
        id++;
        return id;
    }
}