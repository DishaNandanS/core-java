class GymRunner {
public static void main(String[] args) {

Gym[] gyms = new Gym[4];

Gym gym1 = new Gym();
gym1.setGymName("FitZone");
gym1.setNoOfEquipments(50);
gym1.setHasTrainer(true);

Gym gym2 = new Gym();
gym2.setGymName("PowerHouse");
gym2.setNoOfEquipments(40);
gym2.setHasTrainer(false);

Gym gym3 = new Gym();
gym3.setGymName("HealthHub");
gym3.setNoOfEquipments(60);
gym3.setHasTrainer(true);

Gym gym4 = new Gym();
gym4.setGymName("MuscleMania");
gym4.setNoOfEquipments(70);
gym4.setHasTrainer(true);

for (int i = 0; i < gyms.length; i++) {
if (i == 0) {
gyms[i] = gym1;
} else if (i == 1) {
gyms[i] = gym2;
} else if (i == 2) {
gyms[i] = gym3;
} else if (i == 3) {
gyms[i] = gym4;
}
}

for (int i = 0; i < gyms.length; i++) {
Gym gym = gyms[i];
if (gym != null) {
System.out.println(gym.getGymName());
System.out.println(gym.getNoOfEquipments());
System.out.println(gym.isHasTrainer());
}
}
}
}
