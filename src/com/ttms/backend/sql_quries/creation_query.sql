drop database if exists ttms;
/*Creating database ttms*/
create database ttms;

/*Creating table TrainData*/
create table ttms.traindata (
    TrainNo	int,	
    TrainName varchar(100),
    StationName	varchar(500),
    DistanceFromSourceStation int,	
    VacancyQuota varchar(100),
    ArrivalTime varchar(100),
    DepartureTime varchar(100),
    Date varchar(100),
    SourceStationName varchar(500)
);

/*Creating table UserData*/
create table ttms.userdata (
    UserId	varchar(50),
    FirstName	varchar(100),
    LasttName	varchar(100),
    Address	varchar(500),
    Username	varchar(50),
    Password	varchar(50),
    Role	varchar(50) default "User",
    ValletBalance int,
    Gender varchar(50),
    DOB varchar(100),
    AadharNo varchar(16),
    Mobile varchar(10),
    primary key (UserId)
);

/*Creating table PassengerData*/
create table ttms.passenger (
    FirstName	varchar(100),
    LasttName	varchar(100),
    Age	varchar(100),
    Birthdate	varchar(100),
    Aadhar	varchar(100),
    Gender	varchar(50),
    MobileNo varchar(100)
);

/*Creating table TicketData*/
create table ttms.ticketdata (
    TicketNo	varchar(100),
    TrainNumber	varchar(100),
    TrainName	varchar(100),
    SourceStation	varchar(100),
    DestinationStation	varchar(100),
    PassengerName varchar(100),
    SeatNo	varchar(20),
    Price varchar(100),
    primary key (TicketNo)
);

/*Creating table UserLogin*/
create table ttms.userlogin (
    Username varchar(100),
    Password varchar(100)
);
