param Pathlength;

var skuMaterial{0..Pathlength} : integer >=-10000, <= 10000 := 1;

var sku : integer >=-10000, <= 10000 := 1;

var unitMaterial{0..Pathlength} : integer >=-10000, <= 10000 := 1;

var unit : integer >=-10000, <= 10000 := 1;

var registerStatus{0..Pathlength} : integer >=0, <= 1 := false;

set 11h27vdjn975i within {0..Pathlength} default {};

set 500pnefqfsip9 within {0..Pathlength} default {};


set 7atqmknoa2th4 within {0..Pathlength} default {};


set 87jfm793m1qvp within {0..Pathlength} default {};

set bmkcd8pjncpsc within {0..Pathlength} default {};
s.t. bmkcd8pjncpsc_post0{i in bmkcd8pjncpsc} : ((skuMaterial[i])=(sku))and((unitMaterial[i])=(unit));
s.t. bmkcd8pjncpsc_post1{i in bmkcd8pjncpsc} : (registerStatus[i]) = (registerStatus[i-1]);

set 35mf3hcnmpp74 within {0..Pathlength} default {};
s.t. 35mf3hcnmpp74_pre0{i in 35mf3hcnmpp74} : (registerStatus[i])=(1);


set e62l316t11k07 within {0..Pathlength} default {};
s.t. e62l316t11k07_pre0{i in e62l316t11k07} : (registerStatus[i])=(0);


set Register_Region1_Idle within {0..Pathlength} default {};
s.t. Register_Region1_Idle_invariant{i in Register_Region1_Idle} : (state[i])=();

set Register_Region1_Registering within {0..Pathlength} default {};
s.t. Register_Region1_Registering_invariant{i in Register_Region1_Registering} : (state[i])=();

set Register_Region1_Registered within {0..Pathlength} default {};
s.t. Register_Region1_Registered_invariant{i in Register_Region1_Registered} : (state[i])=();


