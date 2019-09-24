ALTER TABLE rental DISABLE TRIGGER ALL;
ALTER TABLE tool DISABLE TRIGGER ALL;
ALTER TABLE useraddress DISABLE TRIGGER ALL;

DELETE
FROM useraddress;

DELETE
FROM tool;

DELETE
FROM rental;

INSERT INTO useraddress (user_userid, street, apartment, city, state, zip)
	VALUES (30, '17th Ave W', 123, 'Seattle', 'WA', '98101'),
           (32, '456 14th Ave S', null, 'Weatherford', 'TX', '76085'),
           (34, '789 Holbrook Street', null, 'Raleigh', 'NC', '27619');

INSERT INTO tool (toolid, available, rental, rentalcost, rentalduration, tooldescription, toolimageurl, toolname, tooltype, ownerid)
    VALUES(1, true, true, 15.00, '24hrs', 'A shiny hammer to hammer things with', 'https://upload.wikimedia.org/wikipedia/commons/8/84/Claw-hammer.jpg', 'hammer', 'hand tool', 30),
          (2, true, false, 0.00, '1wk', 'An AccuMaster jigsaw', 'https://upload.wikimedia.org/wikipedia/commons/7/74/Jigsaw_AccuMaster.jpg', 'jigsaw', 'battery powered',  34),
          (3, false, true, 1000.00, '4hrs', 'Fire Departments worst nightmare', 'https://www.publicdomainpictures.net/pictures/20000/velka/flamethrower.jpg', 'Flamethrower', 'gas powered', 32);

INSERT INTO rental (rentalid, rentaldate, toolid, userid)
    VALUES (1, '09-24-2019', 1, 32),
           (2, '09-23-2019', 2, 30),
	   (3, '09-15-2019', 3, 34);

ALTER TABLE rental ENABLE TRIGGER ALL;
ALTER TABLE tool ENABLE TRIGGER ALL;
ALTER TABLE useraddress ENABLE TRIGGER ALL;

alter sequence hibernate_sequence restart with 20;