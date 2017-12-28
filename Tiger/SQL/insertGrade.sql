insert into GradeInfo values(
	(select StudentID from StudentInfo where name = '刘雪'),
	(select DISTINCT CourseID from CourseInfo where name = '语文'),
	"2017上",
	"Selected",
	80,
	NULL
);
