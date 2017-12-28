/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  coin
 * Created: 2017-12-26
 */
use Tiger;

insert into StudentInfo values("20170001","张小强",15,"male","102",NULL);
insert into StudentInfo values("20170002","李浩",16,"male","102",NULL);
insert into StudentInfo values("20170003","张莉莉",16,"female","102",NULL);
insert into StudentInfo values("20170004","王军",15,"male","104",NULL);
insert into StudentInfo values("20170005","刘雪",15,"female","104",NULL);

insert into TeacherInfo values("20081001","李忠",35,"male",NULL);
insert into TeacherInfo values("20091002","刘涛",30,"female",NULL);
insert into TeacherInfo values("20121003","王健",28,"male",NULL);
insert into TeacherInfo values("20051004","李明明",41,"male",NULL);

insert into CourseInfo values("1001","20081001","2017上","语文",100,NULL);
insert into CourseInfo values("1002","20091002","2017上","数学",100,NULL);
insert into CourseInfo values("1003","20051004","2017上","英语",100,NULL);
insert into CourseInfo values("1003","20051004","2017下","英语",100,NULL);

insert into GradeInfo values("20170001","1001","2017上","Selected",84,NULL);
insert into GradeInfo values("20170001","1002","2017上","Selected",74,NULL);
insert into GradeInfo values("20170001","1003","2017上","Selected",93,NULL);
insert into GradeInfo values("20170002","1001","2017下","Preselection",NULL,NULL);
insert into GradeInfo values("20170002","1002","2017上","Selected",77,NULL);
insert into GradeInfo values("20170003","1003","2017上","Selected",68,NULL);
insert into GradeInfo values("20170004","1002","2017上","Selected",98,NULL);
insert into GradeInfo values("20170005","1002","2017上","Selected",80,NULL);
