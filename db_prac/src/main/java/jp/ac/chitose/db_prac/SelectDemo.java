package jp.ac.chitose.db_prac;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.List;

public class SelectDemo {
    public static void main(String[] args) {
        System.out.print("点数を入力してください:");
        Scanner scan = new Scanner(System.in);
        int lessThan = Integer.valueOf(scan.nextLine());

        try {
            PreExamDAO dao = new PreExamDAO();
            List<PreExam> preExams = dao.selectPreExams(lessThan);
            for(PreExam preExam : preExams){
                preExam.print();
            }
        } catch (SQLException e){
            e.printStackTrace();
        }

    }
}
