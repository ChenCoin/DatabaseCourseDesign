use Tiger;

create table StudentInfo(
	StudentID int NOT NULL,
	name varchar(64) NOT NULL,
	age int,
	sex enum('male','female'),
	class varchar(64),
	time timestamp,
	PRIMARY KEY (StudentID)
)character set = utf8;

create table TeacherInfo(
	TeacherID varchar(64) NOT NULL,
	name varchar(64) NOT NULL,
	age int,
	sex enum('male','female'),
	time timestamp,
	PRIMARY KEY (TeacherID)
)character set = utf8;

create table CourseInfo(
	CourseID varchar(64) NOT NULL,
	TeacherID varchar(64) NOT NULL,
	term varchar(64) NOT NULL,
	name varchar(64) NOT NULL,
	grade int,
	time timestamp,
	PRIMARY KEY (CourseID,TeacherID,term),
	FOREIGN KEY (TeacherID) REFERENCES TeacherInfo(TeacherID)
)character set = utf8;

create table GradeInfo(
	StudentID int NOT NULL,
	CourseID varchar(64) NOT NULL,
	term varchar(64) NOT NULL,
	state enum('Preselection','Selected'),
	grade int,
	time timestamp,
	PRIMARY KEY (StudentID,CourseID,term),
	FOREIGN KEY (StudentID) REFERENCES StudentInfo(StudentID),
	FOREIGN KEY (CourseID) REFERENCES CourseInfo(CourseID)
)character set = utf8;


