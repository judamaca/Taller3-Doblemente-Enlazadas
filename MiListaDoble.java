public class MiListaDoble {

    @Override
    public boolean isEmpty() {
        return this.cabeza == null;
    }

    @Override
    public int getSize() {



    }


    @Override
    public void clear();



    @Override
    public Object getHead();


    @Override
    public Object getTail();


    @Override
    public Object get(DoubleNode node);


    @Override
    public DoubleNode search(Object object);


    @Override
    public boolean add(Object object);


    @Override
    public boolean insert(DoubleNode node, Object object);


    @Override
    public boolean insert(Object objectRef, Object object);


    @Override
    public boolean insertHead(Object object);


    @Override
    public boolean insertTail(Object object);


    @Override
    public boolean set(DoubleNode node, Object object);


    @Override
    public boolean remove(DoubleNode node);


    @Override
    public boolean contains(Object object);


    @Override
    public Object[] toArray();


    @Override
    public Object[] toArray(Object[] object);


    @Override
    public MiListaDoble subList(DoubleNode from, DoubleNode to);


    @Override
    public MiListaDoble sortList();



}
