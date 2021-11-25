package by.tc.task01.entity.criteria;

public final class SearchCriteria {

    /**
     * criteria for kettle
     */
    public static enum Kettle {
        POWER_CONSUMPTION, WEIGHT, CAPACITY;

        public static String getApplianceGroup() {
            return "Kettle";
        }
    }

    /**
     * criteria for oven
     */
    public static enum Oven {
        POWER_CONSUMPTION, WEIGHT, CAPACITY, DEPTH, HEIGHT, WIDTH;

        public static String getApplianceGroup() {
            return "Oven";
        }
    }

    /**
     * criteria for laptop
     */
    public static enum Laptop {
        BATTERY_CAPACITY, OS, MEMORY_ROM, SYSTEM_MEMORY, CPU, DISPLAY_INCHES;

        public static String getApplianceGroup() {
            return "Laptop";
        }
    }

    /**
     * criteria for fridge
     */
    public static enum Refrigerator {
        POWER_CONSUMPTION, WEIGHT, FREEZER_CAPACITY, OVERALL_CAPACITY, HEIGHT, WIDTH;

        public static String getApplianceGroup() {
            return "Refrigerator";
        }
    }

    /**
     * criteria for vacuum cleaner
     */
    public static enum VacuumCleaner {
        POWER_CONSUMPTION, MOTOR_SPEED_REGULATION, CLEANING_WIDTH;

        public static String getApplianceGroup() {
            return "VacuumCleaner";
        }
    }

    /**
     * criteria for tabletPC
     */
    public static enum TabletPC {
        BATTERY_CAPACITY, DISPLAY_INCHES, MEMORY_ROM, FLASH_MEMORY_CAPACITY, COLOR;

        public static String getApplianceGroup() {
            return "TabletPC";
        }
    }

    /**
     * criteria for speakers
     */
    public static enum Speakers {
        POWER_CONSUMPTION, NUMBER_OF_SPEAKERS, CORD_LENGTH;

        public static String getApplianceGroup() {
            return "Speakers";
        }
    }

    private SearchCriteria() {
    }
}

