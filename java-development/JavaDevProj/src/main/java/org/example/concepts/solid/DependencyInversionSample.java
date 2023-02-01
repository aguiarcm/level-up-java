package org.example.concepts.solid;

public class DependencyInversionSample {
    // Dependencies must BE ABSTRACTIONS not CONCRETIONS
    // High level modules must not depend in low level modules

    class WrongDatabaseService {
        void search() {
            // do something.
        };
    }

    class WrongDataAccess {

        WrongDatabaseService wrongDatabaseService;
        WrongDataAccess(WrongDatabaseService wrongDatabaseService) {
            this.wrongDatabaseService = wrongDatabaseService;
        }
        void search() {
            wrongDatabaseService.search();
        }
    }



    interface DataAccessProvider {
        void search();
    }

    class DatabaseAccess implements DataAccessProvider {

        @Override
        public void search() {

        }
    }

    class FileAccess implements  DataAccessProvider {
        @Override
        public void search() {

        }
    }

    class DataAccess {
        DataAccessProvider dataAccessProvider;

        DataAccess(DataAccessProvider dataAccessProvider){
            this.dataAccessProvider = dataAccessProvider;
        }
        void search() {
            dataAccessProvider.search();
        }
    }
}
