show user;

-- hr ���� lock Ǯ�� ��� hr ����
alter user hr identified by hr; -- ��й�ȣ����
alter user hr identified by hr account unlock; -- ��Ǫ�°� 

-- workshop ���� ���� �� ���� �ο�
-- system �����ڰ������� �۾��� ��

create user workshop identified by workshop; -- ���� ����
grant resource, connect to workshop; -- ���� �ο� 