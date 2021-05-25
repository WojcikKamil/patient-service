package pl.wsiz.iid3.healthcenter.dto;

public enum Status {
        ZREALIZOWANA(true),
        NIEZREALIZOWANA(false),
        ZAREZERWOWANA(true);

        boolean doRezerwacji;

        private Status(boolean czyZarezerwowany){
            doRezerwacji = czyZarezerwowany;
        }

}
