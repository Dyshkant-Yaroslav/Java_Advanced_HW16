package ua.lviv.desctop.Homework16;

public interface AbstractCRUD<O> {

	O create(O o);
	O read (Integer index);
	O update(Integer index, O o );
	void delete(Integer id);
	void readAll();
}
